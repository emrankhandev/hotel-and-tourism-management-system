package com.springboot.htms.controller;


import java.time.LocalDate;
import java.util.ArrayList;
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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.htms.controller.impl.IRoomBookingController;
import com.springboot.htms.entities.Hotel;
import com.springboot.htms.entities.Room;
import com.springboot.htms.entities.RoomBooking;
import com.springboot.htms.service.HotelService;
import com.springboot.htms.service.RoomBookingService;
import com.springboot.htms.service.RoomService;


@RestController
@RequestMapping("/bookingroom")
public class RoomBookingController implements IRoomBookingController{

	
	@Autowired
	HotelService hotelService;
	@Autowired
	RoomService roomService;
	@Autowired
	RoomBookingService roomBookingService;

	
	@Override
	@GetMapping("/create")
	public ModelAndView create() {
		
		List<Hotel> hotels = hotelService.getAll();
		List<Room> rooms = roomService.getAll();
		
		
		  List<Room> availRooms = new ArrayList<Room>();
			for (int i = 0; i < rooms.size(); i++) {
				if(rooms.get(i).getStatus() == 1) {
					availRooms.add(rooms.get(i));
				} 
			}
		
		Map<String, Object> map = new HashMap<>();
		map.put("hotels", hotels);
		map.put("rooms", availRooms);
		 
		String hotel = "";
		String room = "";
		
		ObjectMapper mapper = new ObjectMapper();
		ModelAndView model = new ModelAndView();
		
		try {
			
			hotel = mapper.writeValueAsString(hotels);
			room = mapper.writeValueAsString(rooms);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		
		model.setViewName("bookingroom/create");
		model.addObject("hotels", hotel);
		model.addObject("rooms", room);
		model.addObject("map", map);
		return model;
	}

	@Override
	@PostMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		
		RoomBooking rb = roomBookingService.save(request);
		return new ModelAndView("bookingroom/create", "rb", rb);
	}

	@Override
	@GetMapping("/update/{id}")
	public ModelAndView edit(@PathVariable String id) {
		System.out.println("this placve+ " + id);		
		
		RoomBooking rbk = roomBookingService.getRoomBookingByCode(id);		
		return new ModelAndView("payment/payment", "rbk", rbk);
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		
		roomBookingService.update(request);
		List<RoomBooking> rbs = roomBookingService.getAll();
		return new ModelAndView("bookingroom/roomstatus", "rbs", rbs);
	}

	@Override
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable String id) {
		
		roomBookingService.delete(id);
		List<RoomBooking> rb = roomBookingService.getAll();
		return new ModelAndView("bookingroom/roomstatus", "rb", rb);
	}

	@Override
	@GetMapping("/roomstatus")
	public ModelAndView getAll() {

		List<Room> r = roomService.getAll();
		List<RoomBooking> rb = roomBookingService.getAll();
		Map<String, Object> data = new HashMap<>();
		data.put("r", r);
		data.put("rb", rb);
		return new ModelAndView("bookingroom/roomstatus", "data", data);
	}
	
   @GetMapping("/available")
   public ModelAndView getAllRoom() {
	    
	   List<Room> r = roomService.getAvailable();
	   return new ModelAndView("bookingroom/available", "r", r);
	    
   }
	 
	
	@GetMapping("/booked")
	public ModelAndView getAllBookedRoom() {
		
		List<RoomBooking> rb = roomBookingService.getBooked();
		return new ModelAndView("bookingroom/booked", "rb", rb);
	}
	
	@PostMapping("/store")
    public ModelAndView rStore(HttpServletRequest request) {

        String hotelName = request.getParameter("hotelName");
        String hotelLocation = request.getParameter("hotelLocation");
        String roomCode = request.getParameter("roomCode");
        String roomStatus = request.getParameter("roomStatus");
        String roomInfo = request.getParameter("roomInfo");
        String checkInDate = request.getParameter("checkInDate");
        String checkOutDate = request.getParameter("checkOutDate");
        String invoiceDate = LocalDate.now().toString();
        Double roomPrice = Double.parseDouble(request.getParameter("roomPrice"));
        Double total = roomPrice;
        Double discount = Double.parseDouble(request.getParameter("discount"));
        Double tDiscount = ((total * discount) / 100);
        Double netTotal = total - tDiscount;
        Double vat = Double.parseDouble(request.getParameter("vat"));
        Double tVat = ((netTotal * vat) / 100);
        Double grandTotal = (netTotal + tVat);  
        
        RoomBooking rb = new RoomBooking();
        rb.setHotelName(hotelName);
        rb.setHotelLocation(hotelLocation);
        rb.setRoomCode(roomCode);
        rb.setRoomStatus(roomStatus);
        rb.setRoomInfo(roomInfo);
        rb.setCheckInDate(checkInDate);
        rb.setCheckOutDate(checkOutDate);
        rb.setInvoiceDate(invoiceDate);
        rb.setRoomPrice(roomPrice);
        rb.setDiscount(discount);
        rb.settDiscount(tDiscount);
        rb.setTotal(total);
        rb.setNetTotal(netTotal);
        rb.setVat(vat);
        rb.settVat(tVat);
        rb.setGrandTotal(grandTotal);       
        roomBookingService.save(request);
        
        return new ModelAndView("bookingroom/create");

    }
	
	@GetMapping("/pay")
	public ModelAndView payment() {
		
		List<RoomBooking> rbs = roomBookingService.getAll();

		return new ModelAndView("payment/payment", "rbs", rbs);
	}
	

}
