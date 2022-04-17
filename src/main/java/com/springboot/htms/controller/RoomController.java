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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.htms.common.ICommonController;
import com.springboot.htms.entities.Hotel;
import com.springboot.htms.entities.Room;
import com.springboot.htms.service.HotelService;
import com.springboot.htms.service.RoomService;


@RestController
@RequestMapping("/room")
public class RoomController implements ICommonController{

	
	@Autowired
    HotelService hotelService;
	
	@Autowired
	RoomService roomService;
	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		List<Hotel> hotels = hotelService.getAll();
		
		Map<String, Object> map = new HashMap<>();
		map.put("hotels", hotels);
		return new ModelAndView("room/create", "map", map);
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		Room sc = roomService.save(request);
		return new ModelAndView("room/create", "sc", sc);
	}

	@Override
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable String id) {
		
		Room sc = roomService.getRoomByCode(id);
		List<Hotel> hotels = hotelService.getAll();
		Map<String, Object> data = new HashMap<>();
		data.put("room", sc);
		data.put("hotel", hotels);
		return new ModelAndView("/room/edit", "data", data);
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		
		roomService.update(request);
		List<Room> rooms = roomService.getAll();
		return new ModelAndView("room/view", "rooms", rooms);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable String id) {
		
		roomService.delete(id);
		List<Room> rooms = roomService.getAll();
		return new ModelAndView("room/view", "rooms", rooms);
	}

	@Override
	@GetMapping("/view")
	public ModelAndView getAll() {
		
		List<Room> rooms = roomService.getAll();
		return new ModelAndView("room/view", "rooms", rooms); /*  */
	}

}
