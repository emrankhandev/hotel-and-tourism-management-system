package com.springboot.htms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.htms.controller.impl.IPlaceController;
import com.springboot.htms.entities.Place;
import com.springboot.htms.service.PlaceService;


@RestController
@RequestMapping("/place")
public class PlaceController implements IPlaceController{

	@Autowired
    PlaceService placeService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		
		return new ModelAndView("place/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		placeService.save(request);
        return new ModelAndView("place/create");
	}

	@Override
	@GetMapping("/edit/{code}")
	public ModelAndView edit(@PathVariable String code) {
		
		String pCode = code;
		Place p = placeService.getPlaceByCode(pCode);
		return new ModelAndView("place/edit", "p", p);
	}

	@Override
	@PostMapping("/update")
	public ModelAndView update(HttpServletRequest request) {
		
		placeService.update(request);
		List<Place> places = placeService.getAll();
		return new ModelAndView("place/view", "places", places);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable String id) {
		
		placeService.delete(id);
		List<Place> places = placeService.getAll();
		return new ModelAndView("place/view", "places", places);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		
		List<Place> places = placeService.getAll();
		return new ModelAndView("place/view", "places", places);
	}

}
