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

import com.springboot.htms.controller.impl.IHotelController;
import com.springboot.htms.entities.Hotel;
import com.springboot.htms.service.HotelService;


@RestController
@RequestMapping("/hotel")
public class HotelController implements IHotelController{

	@Autowired
    HotelService hotelService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		
		return new ModelAndView("hotel/create");
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		hotelService.save(request);
        return new ModelAndView("hotel/create");
	}

	@Override
	@GetMapping("/edit/{code}")
	public ModelAndView edit(@PathVariable String code) {
		
		String hCode = code;
		Hotel c = hotelService.getHotelByCode(hCode);
		return new ModelAndView("hotel/edit", "c", c);
	}

	@Override
	@PostMapping("/update")
	public ModelAndView update(HttpServletRequest request) {
		
		hotelService.update(request);
        List<Hotel> hotels = hotelService.getAll();
        return new ModelAndView("hotel/view", "hotels", hotels);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable String id) {
		
		hotelService.delete(id);
		List<Hotel> hotels = hotelService.getAll();
		return new ModelAndView("hotel/view", "hotels", hotels);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		
		List<Hotel> hotels = hotelService.getAll();
		return new ModelAndView("hotel/view", "hotels", hotels);
	}

}
