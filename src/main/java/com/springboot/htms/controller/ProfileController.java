package com.springboot.htms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.htms.controller.impl.IProfileController;

@RestController
@RequestMapping("/profile")
public class ProfileController implements IProfileController{

	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		
		return new ModelAndView("customerprofile/create");
	}
	
	@GetMapping("/minvoice")
	public ModelAndView mInvoice() {
		
		return new ModelAndView("manualinvoice/create");
	}

	@Override
	public ModelAndView save(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

}
