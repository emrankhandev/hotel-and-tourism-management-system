package com.springboot.htms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.htms.controller.impl.IPackageController;
import com.springboot.htms.entities.Hotel;
import com.springboot.htms.entities.PackageOne;
import com.springboot.htms.entities.Place;
import com.springboot.htms.entities.Room;
import com.springboot.htms.service.HotelService;
import com.springboot.htms.service.PackageService;
import com.springboot.htms.service.PlaceService;
import com.springboot.htms.service.RoomService;


@RestController
@RequestMapping("/pack")
public class PackageController implements IPackageController{

	@Autowired
	HotelService hotelService;
	@Autowired
	RoomService roomService;	
	@Autowired
	PlaceService placeService;
	@Autowired
	PackageService packageService;
	
	
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		
		List<Hotel> hotels = hotelService.getAll();
		List<Room> rooms = roomService.getAll();
		List<Place> places = placeService.getAll();
		
		Map<String, Object> map = new HashMap<>();
		map.put("hotels", hotels);
		map.put("rooms", rooms);
		map.put("places", places);
		
		String hotel = "";
		String room = "";
		String place = "";
		
		ObjectMapper mapper = new ObjectMapper();
		ModelAndView model = new ModelAndView();
		
		try {
			
			hotel = mapper.writeValueAsString(hotels);
			room = mapper.writeValueAsString(rooms);
			place = mapper.writeValueAsString(places);
			
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		
		model.setViewName("pack/create");
		model.addObject("hotels", hotel);
		model.addObject("rooms", room);
		model.addObject("places", place);
		model.addObject("map", map);
		return model;
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		packageService.save(request);
		return new ModelAndView("pack/create");
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
		
		List<PackageOne> pOne = packageService.getAll();
		return new ModelAndView("pack/view", "pOne", pOne);
	}
	

}
