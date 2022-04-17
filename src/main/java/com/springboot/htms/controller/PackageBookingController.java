package com.springboot.htms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.htms.controller.impl.IPackageBookingController;
import com.springboot.htms.entities.PackageOne;
import com.springboot.htms.service.PackageBookingService;
import com.springboot.htms.service.PackageService;
import com.springboot.htms.service.PaymentService;


@RestController
@RequestMapping("/package")
public class PackageBookingController implements IPackageBookingController{

	@Autowired
	PackageService packageService;
	
	@Autowired
	PaymentService paymentService;
	
	@Autowired
	PackageBookingService packageBookingService;
	
	@Override
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView save(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable String id) {
		
		PackageOne po = packageService.getPackageByCode(id);
		return new ModelAndView("packagebooking/packagepayment", "po", po);
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

	@GetMapping("/packages")
	public ModelAndView pReport() {
		
		List<PackageOne> pOne = packageService.getAll();
		return new ModelAndView("packagebooking/package", "pOne", pOne);
	}
	
	@GetMapping("/packagepayment")
	public ModelAndView pPayment() {
		
		List<PackageOne> pp= packageService.getAll();
		return new ModelAndView("packagebooking/packagepayment", "pp", pp);
	}
	
}
