package com.springboot.htms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.PackageBookingDAO;
import com.springboot.htms.entities.PackageBooking;
import com.springboot.htms.service.impl.IPackageBookingService;

@Service(value = "packageBookingService")
public class PackageBookingService implements IPackageBookingService{

	@Autowired
	PackageBookingDAO packageBookingDAO;
	
	@Override
	public PackageBooking save(HttpServletRequest request) {
				
		return null;
	}

	@Override
	public PackageBooking edit(String id) {
		
		return null;
	}
	
	public PackageBooking getPackageBookingByCode (String id) {
		
		return packageBookingDAO.getByCode(id);
	}

	@Override
	public PackageBooking update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PackageBooking> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
