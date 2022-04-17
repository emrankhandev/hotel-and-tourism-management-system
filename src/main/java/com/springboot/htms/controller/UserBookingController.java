package com.springboot.htms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.htms.controller.impl.IUserController;

@RestController
@RequestMapping("/user")
public class UserBookingController implements IUserController{

	@Override
	@GetMapping("/otp")
	public ModelAndView create() {
		
		return new ModelAndView("userbooking/otp");
	}
	
	@GetMapping("/packageotp")
	public ModelAndView create3() {
		
		return new ModelAndView("userbooking/packageotp");
	}
	
	@GetMapping("/invoice")
	public ModelAndView create2() {
		
		return new ModelAndView("invoice/userinvoice");
	}
	
	@GetMapping("/packageinvoice")
	public ModelAndView create4() {
		
		return new ModelAndView("invoice/userpackageinvoice");
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
	public ModelAndView getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
