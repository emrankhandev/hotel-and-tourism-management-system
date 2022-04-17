package com.springboot.htms.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.springboot.htms.controller.impl.IAdminController;

@RestController
public class AdminController implements IAdminController{

	@Override
	public ModelAndView create() {		
		
		return null;
	}
	
	@PostMapping("/admindashboard")
	public ModelAndView dash(HttpServletRequest request) {
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        Map<String, Object> map = new HashMap<String, Object>();

	       if (email.equalsIgnoreCase("admin@gmail.com") && password.equalsIgnoreCase("1234")) {
	           
	    	   return new ModelAndView("admin/dashboard");
	    	   
	       } else {
	           map.put("status", "Incorrect Email or password");
	           return new ModelAndView("login/login", "map", map);
	       }
	}
	
	@GetMapping("/")
	public ModelAndView create2() {		
		
		return new ModelAndView("landing");
	}
	
	@GetMapping("/landding")
	public ModelAndView create4() {		
		
		return new ModelAndView("landing2");
	}
	
	@GetMapping("/landdiing")
	public ModelAndView create5() {		
		
		return new ModelAndView("landing3");
	}
	
	@GetMapping("/adminlogin")
	public ModelAndView create3() {		
		
		return new ModelAndView("admin/dashboard");
	}

	@Override
	@GetMapping("/login")
	public ModelAndView save(HttpServletRequest request) {
				
		return new ModelAndView("login/login");
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
