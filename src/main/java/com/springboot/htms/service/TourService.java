package com.springboot.htms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.TourDAO;
import com.springboot.htms.entities.Tour;
import com.springboot.htms.service.impl.ITourService;

@Service(value = "tourService")
public class TourService implements ITourService{

	@Autowired
    TourDAO tourDAO;
	
	@Override
	public Tour save(HttpServletRequest request) {
		
		Tour t = new Tour();
        t.setCode(request.getParameter("code"));
        Double d = Double.valueOf(request.getParameter("fee"));
        t.setFee(d);
        return tourDAO.save(t);
	}
	
	public Tour getTourByCode(String code) {
		return tourDAO.getByCode(code);
	}

	@Override
	public Tour edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tour update(HttpServletRequest request) {
		
		Tour t = new Tour();
		t.setCode(request.getParameter("code"));
		Double d = Double.valueOf(request.getParameter("fee"));
		t.setFee(d);
		return tourDAO.update(t);
	}

	@Override
	public List<Tour> getAll() {
		
		return tourDAO.getAll();
	}

	@Override
	public boolean delete(String id) {
		
		Tour t = tourDAO.getByCode(id);
		tourDAO.delete(t);
		return true;
	}

}
