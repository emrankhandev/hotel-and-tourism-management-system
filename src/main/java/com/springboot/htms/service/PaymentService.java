package com.springboot.htms.service;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.PaymentDAO;
import com.springboot.htms.dao.RoomBookingDAO;
import com.springboot.htms.entities.Payment;
import com.springboot.htms.entities.RoomBooking;
import com.springboot.htms.service.impl.IPaymentService;


@Service(value = "paymentService")
public class PaymentService implements IPaymentService{

	
	@Autowired
	PaymentDAO paymentDAO;
	
	@Autowired
	RoomBookingService roomBookingService;
	
	@Autowired
	RoomBookingDAO roomBookingDAO;
	
	@Override
	public Payment save(HttpServletRequest request) {

		Payment p = new Payment();
		
		p.setPaymentCode(request.getParameter("pCode"));
		p.setRoomCode(request.getParameter("roomCode"));
		p.setCartType(request.getParameter("cartType"));
		p.setBankName(request.getParameter("bankName"));
		p.setExpireDate(request.getParameter("expireDate"));
		p.setCartNo(request.getParameter("cartNo"));
		p.setCvvNo(request.getParameter("cvvNo"));
		p.setFirstName(request.getParameter("firstName"));
		p.setLastName(request.getParameter("lastName"));
		p.setEmail(request.getParameter("email"));
		p.setPhone(request.getParameter("phone"));
		p.setCity(request.getParameter("city"));
		p.setNid(request.getParameter("nid"));
		p.setPaymentStatus("PAID");
		p.setCheckInDate(request.getParameter("checkInDate"));
		p.setCheckOutDate(request.getParameter("checkoutDate"));
		p.setRoomPrice(Double.parseDouble(request.getParameter("roomPrice")));
		p.setFoodPrice(Double.parseDouble(request.getParameter("foodPrice")));
		p.setDiscount(Double.parseDouble(request.getParameter("discount")));
		p.setVat(Double.parseDouble(request.getParameter("vat")));
		p.setTotal(Double.parseDouble(request.getParameter("total")));
		p.setNetTotal(Double.parseDouble(request.getParameter("netTotal")));
		p.setGrandTotal(Double.parseDouble(request.getParameter("grandTotal")));
		String invoiceDate = LocalDate.now().toString();
		p.setInvoiceDate(invoiceDate);
		paymentDAO.save(p);
		RoomBooking rb = roomBookingService.getRoomBookingByCode(request.getParameter("roomCode"));
		rb.setPaymentStatus(1);
		roomBookingDAO.update(rb);
		
		return null;
	}

	@Override
	public Payment edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Payment getPaymentByCode(String code) {
		
		return paymentDAO.getByCode(code);
	}

	@Override
	public Payment update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getAll() {
		
		return paymentDAO.getAll();
	}

	@Override
	public boolean delete(String id) {
				
		Payment p = paymentDAO.getByCode(id);
		paymentDAO.delete(p);
		return true;
	}

}
