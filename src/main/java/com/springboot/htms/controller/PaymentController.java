package com.springboot.htms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.htms.controller.impl.IPaymentController;
import com.springboot.htms.entities.Payment;
import com.springboot.htms.entities.RoomBooking;
import com.springboot.htms.service.PaymentService;
import com.springboot.htms.service.RoomBookingService;

@RestController
@RequestMapping("payment")
public class PaymentController implements IPaymentController{

	
	@Autowired
	PaymentService paymentService;
	
	@Autowired
	RoomBookingService roomBookingService;
	
	@Override
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		paymentService.save(request);
		List<Payment> p = paymentService.getAll();
		List<RoomBooking> rb = roomBookingService.getAll();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("p", p);
		data.put("rb", rb);
		return new ModelAndView("payment/success", "data", data);
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable String id) {
		
		Payment payment = paymentService.getPaymentByCode(id);
		
		return new ModelAndView("/invoice/invoice", "payment", payment);
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
		
		List<Payment> p = paymentService.getAll();
		return new ModelAndView("bookingroom/paymentreports", "p", p);
	}

}
