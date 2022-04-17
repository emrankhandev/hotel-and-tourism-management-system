package com.springboot.htms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.htms.controller.impl.IFoodController;
import com.springboot.htms.entities.Food;
import com.springboot.htms.service.FoodService;


@RestController
@RequestMapping("/food")
public class FoodController implements IFoodController{

	@Autowired
    FoodService foodService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		
		return new ModelAndView("food/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		foodService.save(request);
        return new ModelAndView("food/create");
	}

	@Override
	@GetMapping("/edit/{code}")
	public ModelAndView edit(@PathVariable String code) {
		
		String fCode = code;
		Food c = foodService.getFoodByCode(fCode);
		return new ModelAndView("food/edit", "c", c);
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		
		foodService.update(request);
        List<Food> foods = foodService.getAll();
        return new ModelAndView("food/view", "foods", foods);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable String id) {
		
		foodService.delete(id);
		List<Food> foods = foodService.getAll();
		return new ModelAndView("food/view", "foods", foods);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		
		List<Food> foods = foodService.getAll();
		return new ModelAndView("food/view", "foods", foods);
	}
	

	@GetMapping("/viewfood")
	public List<Food> getAllFood() {
		
		List<Food> foods = foodService.getAll();
		return foods;
	}


}
