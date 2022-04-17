package com.springboot.htms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.PlaceDAO;
import com.springboot.htms.entities.Place;
import com.springboot.htms.service.impl.IPlaceService;


@Service(value = "placeService")
public class PlaceService implements IPlaceService{

	@Autowired
	PlaceDAO placeDAO;
	
	@Override
	public Place save(HttpServletRequest request) {
		
		Place p = new Place();
		p.setCode(request.getParameter("code"));
		p.setImage(request.getParameter("image"));
		p.setCost(Double.parseDouble(request.getParameter("cost")));
		p.setDescrip(request.getParameter("descrip"));
		return placeDAO.save(p);
	}
	
	public Place getPlaceByCode(String code) {
		
		return placeDAO.getByCode(code);
	}

	@Override
	public Place edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Place update(HttpServletRequest request) {
		
		Place p = new Place();
		p.setCode(request.getParameter("code"));
		p.setImage(request.getParameter("image"));
		p.setCost(Double.parseDouble(request.getParameter("cost")));
		p.setDescrip(request.getParameter("descrip"));
		return placeDAO.update(p);
	}

	@Override
	public List<Place> getAll() {
		
		return placeDAO.getAll();
	}

	@Override
	public boolean delete(String id) {
		
		Place p = placeDAO.getByCode(id);
		placeDAO.delete(p);
		return true;
	}

}
