package com.springboot.htms.service;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.RoomBookingDAO;
import com.springboot.htms.dao.RoomDAO;
import com.springboot.htms.entities.Room;
import com.springboot.htms.entities.RoomBooking;
import com.springboot.htms.service.impl.IRoomBookingService;


@Service(value = "roomBookingService")
public class RoomBookingService implements IRoomBookingService{

	@Autowired
	RoomBookingDAO roomBookingDAO;
	
	
	@Autowired
	RoomService roomService;
	
	
	@Autowired
	RoomDAO roomDAO;
	
	@Override
	public RoomBooking save(HttpServletRequest request) {
		
		RoomBooking rb = new RoomBooking();
		
		String hotelName = request.getParameter("hotelName");
        String hotelLocation = request.getParameter("hotelLocation");
        String roomCode = request.getParameter("roomCode");
        String roomStatus = request.getParameter("roomStatus");
        String roomInfo = request.getParameter("roomInfo");
        String checkInDate = request.getParameter("checkInDate");
        String checkOutDate = request.getParameter("checkOutDate");
        String invoiceDate = LocalDate.now().toString();
        String roomType = request.getParameter("roomType");
        Double roomPrice = Double.parseDouble(request.getParameter("roomPrice"));
        Double foodPrice = Double.parseDouble(request.getParameter("foodPrice"));
        Double total = roomPrice + foodPrice;
        Double discount = Double.parseDouble(request.getParameter("discount"));
        Double tDiscount = ((total * discount) / 100);
        Double netTotal = total - tDiscount;
        Double vat = Double.parseDouble(request.getParameter("vat"));
        Double tVat = ((netTotal * vat) / 100);
        Double grandTotal = (netTotal + tVat);
        
        rb.setHotelName(hotelName);
        rb.setHotelLocation(hotelLocation);
        rb.setRoomCode(roomCode);
        rb.setRoomStatus(roomStatus);
        rb.setRoomInfo(roomInfo);
        rb.setCheckInDate(checkInDate);
        rb.setCheckOutDate(checkOutDate);
        rb.setInvoiceDate(invoiceDate);
        rb.setRoomType(roomType);
        rb.setRoomPrice(roomPrice);
        rb.setFoodPrice(foodPrice);
        rb.setDiscount(discount);
        rb.settDiscount(tDiscount);
        rb.setTotal(total);
        rb.setNetTotal(netTotal);
        rb.setVat(vat);
        rb.settVat(tVat);
        rb.setGrandTotal(grandTotal);
        rb.setPaymentStatus(0);
        
        Room b = roomService.getRoomByCode(roomCode);
        b.setStatus(0);
        roomDAO.update(b);
		
		return roomBookingDAO.save(rb);
	}

	public RoomBooking getRoomBookingByCode(String code) {
		return roomBookingDAO.getByCode(code);
	}
	
	@Override
	public RoomBooking edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomBooking update(HttpServletRequest request) {
		
		RoomBooking rb = new RoomBooking();		
		rb.setId(Integer.valueOf(request.getParameter("id")));		
		String hotelName = request.getParameter("hotelName");
        String hotelLocation = request.getParameter("hotelLocation");
        String roomCode = request.getParameter("roomCode");
        String roomStatus = request.getParameter("roomStatus");
        String roomInfo = request.getParameter("roomInfo");
        String roomType = request.getParameter("roomType");
        String invoiceDate = LocalDate.now().toString();
        String checkInDate = request.getParameter("checkInDate");
        String checkOutDate = request.getParameter("checkOutDate");
        Double roomPrice = Double.parseDouble(request.getParameter("roomPrice"));
        Double foodPrice = Double.parseDouble(request.getParameter("foodPrice"));
        Double total = roomPrice + foodPrice;
        Double discount = Double.parseDouble(request.getParameter("discount"));
        Double tDiscount = ((total * discount) / 100);
        Double netTotal = total - tDiscount;
        Double vat = Double.parseDouble(request.getParameter("vat"));
        Double tVat = ((netTotal * vat) / 100);
        Double grandTotal = (netTotal + tVat);
        
        rb.setHotelName(hotelName);
        rb.setHotelLocation(hotelLocation);
        rb.setRoomCode(roomCode);
        rb.setRoomStatus(roomStatus);
        rb.setRoomInfo(roomInfo);
        rb.setCheckInDate(checkInDate);
        rb.setCheckOutDate(checkOutDate);
        rb.setInvoiceDate(invoiceDate);
        rb.setRoomType(roomType);
        rb.setRoomPrice(roomPrice);
        rb.setFoodPrice(foodPrice);
        rb.setDiscount(discount);
        rb.settDiscount(tDiscount);
        rb.setTotal(total);
        rb.setNetTotal(netTotal);
        rb.setVat(vat);
        rb.settVat(tVat);
        rb.setGrandTotal(grandTotal);
		return roomBookingDAO.update(rb);
	}

	@Override
	public List<RoomBooking> getAll() {
		
		return roomBookingDAO.getAll();
	}

	@Override
	public boolean delete(String id) {
		
		RoomBooking rb = roomBookingDAO.getByCode(id);
		roomBookingDAO.delete(rb);
		return true;
	}
	
	public List<RoomBooking> getBooked() {
		
		return roomBookingDAO.getBooked();
	}
	
	/*
	 * public List<RoomBooking> getAvailable() {
	 * 
	 * return roomBookingDAO.getAvailable(); }
	 */

	
}
