package com.springboot.htms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.PackageDAO;
import com.springboot.htms.entities.PackageOne;
import com.springboot.htms.service.impl.IPackageService;

@Service(value = "packageService")
public class PackageService implements IPackageService{

	
	@Autowired
	PackageDAO packageDAO;
	
	@Override
	public PackageOne save(HttpServletRequest request) {
		
		PackageOne p = new PackageOne();
		
		String packageCode = request.getParameter("packageCode");
		String hotelName = request.getParameter("hotelName");
		String roomNumber = request.getParameter("roomNumber");
		String roomInfo = request.getParameter("roomInfo");
		String roomType = request.getParameter("roomType");
		String roomStatus = request.getParameter("roomStatus");
		Double roomPrice = Double.parseDouble(request.getParameter("roomPrice"));
		String tourCode = request.getParameter("code");
		Double tourCost = Double.parseDouble(request.getParameter("tourCost"));
		String tourInfo = request.getParameter("tourDescrip");
		String checkInDate = request.getParameter("arrivalDate");
        String checkOutDate = request.getParameter("departureDate");
        Double guideFee = Double.parseDouble(request.getParameter("guideFee"));
        Double foodFee = Double.parseDouble(request.getParameter("food"));
        Double total = roomPrice + foodFee + guideFee + tourCost;
        Double discount = Double.parseDouble(request.getParameter("discount"));
        Double tDiscount = ((total * discount) / 100);
        Double netTotal = total - tDiscount;
        Double vat = Double.parseDouble(request.getParameter("vat"));
        Double tVat = ((netTotal * vat) / 100);
        Double grandTotal = (netTotal + tVat);
        
        p.setPackageCode(packageCode);
        p.setHotelName(hotelName);
        p.setRoomNumber(roomNumber);
        p.setRoomInfo(roomInfo);
        p.setRoomType(roomType);
        p.setRoomStatus(roomStatus);
        p.setRoomPrice(roomPrice);
        p.setTourCode(tourCode);
        p.setTourCost(tourCost);
        p.setTourInfo(tourInfo);
        p.setCheckInDate(checkInDate);
        p.setCheckOutDate(checkOutDate);
        p.setGuideFee(guideFee);
        p.setFoodFee(foodFee);
        p.setTotal(grandTotal);
        p.setDiscount(discount);
        p.settDiscount(tDiscount);
        p.setTotal(grandTotal);
        p.setNetTotal(netTotal);
        p.setVat(vat);
        p.settVat(tVat);
        p.setGrandTotal(grandTotal); 
        
		return packageDAO.save(p);
	}

	@Override
	public PackageOne edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public PackageOne getPackageByCode(String code) {
		return packageDAO.getByCode(code);
	}
	@Override
	public PackageOne update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PackageOne> getAll() {
		
		return packageDAO.getAll();
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
