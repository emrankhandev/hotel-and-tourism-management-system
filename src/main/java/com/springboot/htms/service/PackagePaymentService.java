package com.springboot.htms.service;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.PackagePaymentDAO;
import com.springboot.htms.entities.PackagePayment;
import com.springboot.htms.service.impl.IPackagePaymentService;

@Service(value = "packagePaymentService")
public class PackagePaymentService implements IPackagePaymentService{

	@Autowired
	PackagePaymentDAO packagePaymentDAO;
	
	@Override
	public PackagePayment save(HttpServletRequest request) {
		
		PackagePayment pp = new PackagePayment();
		pp.setPackagePaymentCode(request.getParameter("pPcode"));
		pp.setPackageCode(request.getParameter("pCode"));
		pp.setCheckInDate(request.getParameter("checkInDate"));
		pp.setCheckOutDate(request.getParameter("checkoutDate"));
		pp.setRoomNumber(request.getParameter("rNumber"));
		pp.setRoomPrice(Double.parseDouble(request.getParameter("roomPrice")));
		pp.setFoodPrice(Double.parseDouble(request.getParameter("fPrice")));
		pp.setGuideFee(Double.parseDouble(request.getParameter("gFee")));
		pp.setTourCost(Double.parseDouble(request.getParameter("tourCost")));
		pp.setDiscount(Double.parseDouble(request.getParameter("discount")));
		pp.setVat(Double.parseDouble(request.getParameter("vat")));
		pp.setTotal(Double.parseDouble(request.getParameter("total")));
		String invoiceDate = LocalDate.now().toString();
		pp.setInvoiceDate(invoiceDate);
		pp.setNetTotal(Double.parseDouble(request.getParameter("netTotal")));
		pp.setGrandTotal(Double.parseDouble(request.getParameter("grandTotal")));
		pp.setCartType(request.getParameter("cartType"));
		pp.setBankName(request.getParameter("bankName"));
		pp.setExpireDate(request.getParameter("expireDate"));
		pp.setCartNo(request.getParameter("cartNo"));
		pp.setCvvNo(request.getParameter("cvvNo"));
		pp.setFirstName(request.getParameter("firstName"));
		pp.setLastName(request.getParameter("lastName"));
		pp.setEmail(request.getParameter("email"));
		pp.setNid(request.getParameter("nid"));
		pp.setCity(request.getParameter("city"));
		pp.setPaymentStatus("paid");
		
		return packagePaymentDAO.save(pp);
	}

	@Override
	public PackagePayment edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public PackagePayment getPackagePaymentByCode(String id) {
		
		return packagePaymentDAO.getByCode(id);
	}
	
	

	@Override
	public PackagePayment update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PackagePayment> getAll() {
		
		return packagePaymentDAO.getAll();
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
