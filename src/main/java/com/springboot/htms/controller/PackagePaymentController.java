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

import com.springboot.htms.controller.impl.IPackagePaymentController;
import com.springboot.htms.entities.PackagePayment;
import com.springboot.htms.service.PackagePaymentService;

@RestController
@RequestMapping("/packagepayment")
public class PackagePaymentController implements IPackagePaymentController{

	@Autowired
	PackagePaymentService packagePaymentService;
	
	@Override
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		packagePaymentService.save(request);
		return new ModelAndView("packagebooking/success");
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable String id) {
		
		PackagePayment pp = packagePaymentService.getPackagePaymentByCode(id);
		return new ModelAndView("/invoice/packageinvoice", "pp", pp);
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
	@GetMapping("/report")
	public ModelAndView getAll() {
		
		List<PackagePayment> p = packagePaymentService.getAll();
		return new ModelAndView("packagebooking/paymentreport", "p", p);
	}

}
