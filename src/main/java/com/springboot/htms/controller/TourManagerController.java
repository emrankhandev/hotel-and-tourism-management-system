package com.springboot.htms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.htms.controller.impl.ITourManagerController;
import com.springboot.htms.entities.TourManager;
import com.springboot.htms.service.TourManagerService;


@RestController
@RequestMapping("/tourmanager")
public class TourManagerController implements ITourManagerController{

	@Autowired
	TourManagerService tourManagerSerdvice;
	
	
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		
		return new ModelAndView("tourmanager/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		tourManagerSerdvice.save(request);
		return new ModelAndView("tourmanager/create");
	}

	@Override
	public ModelAndView edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		
		List<TourManager> tm = tourManagerSerdvice.getAll();
		return new ModelAndView("tourmanager/view", "tm", tm);
	}

}
