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

import com.springboot.htms.common.ICommonController;
import com.springboot.htms.entities.Tour;
import com.springboot.htms.service.TourService;


@RestController
@RequestMapping("/tour")
public class TourController implements ICommonController{

	@Autowired
    TourService tourService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		
		return new ModelAndView("tour/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		tourService.save(request);
        return new ModelAndView("tour/create");
	}

	@Override
	@GetMapping("/edit/{code}")
	public ModelAndView edit(@PathVariable String code) {
		
		String tCode = code;
		Tour c = tourService.getTourByCode(tCode);
		System.out.println(tCode);
		return new ModelAndView("tour/edit", "c", c);
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		
		tourService.update(request);
        List<Tour> tours = tourService.getAll();
        return new ModelAndView("tour/view", "tours", tours);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable String id) {
		
		tourService.delete(id);
		List<Tour> tours = tourService.getAll();
		return new ModelAndView("tour/view", "tours", tours);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		
		List<Tour> tours = tourService.getAll();
		return new ModelAndView("tour/view", "tours", tours);
	}

}
