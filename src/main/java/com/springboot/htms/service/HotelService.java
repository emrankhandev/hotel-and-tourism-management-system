package com.springboot.htms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.HotelDAO;
import com.springboot.htms.entities.Hotel;
import com.springboot.htms.service.impl.IHotelService;


@Service(value = "hotelService")
public class HotelService implements IHotelService{

	
	@Autowired
    HotelDAO hotelDAO;
	
	@Override
	public Hotel save(HttpServletRequest request) {

        Hotel h = new Hotel();
        h.setCode(request.getParameter("code"));
        h.setName(request.getParameter("name"));
        h.setLocation(request.getParameter("location"));
        return hotelDAO.save(h);
	}
	
	public Hotel getHotelByCode(String code) {
		return hotelDAO.getByCode(code);
	}

	@Override
	public Hotel edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel update(HttpServletRequest request) {
		
		Hotel h = new Hotel();
		h.setCode(request.getParameter("code"));
		h.setName(request.getParameter("name"));
		h.setLocation(request.getParameter("location"));
		return hotelDAO.update(h);
	}

	@Override
	public List<Hotel> getAll() {
		
		return hotelDAO.getAll();
	}

	@Override
	public boolean delete(String id) {
		
		Hotel h = hotelDAO.getByCode(id);
		hotelDAO.delete(h);
		return true;
	}

}
