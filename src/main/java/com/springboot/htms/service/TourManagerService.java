/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.htms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.TourManagerDAO;
import com.springboot.htms.entities.TourManager;
import com.springboot.htms.service.impl.ITourManagerService;


@Service
public class TourManagerService implements ITourManagerService {

	@Autowired
    TourManagerDAO tourManagerDAO;
	
	@Override
	public TourManager save(HttpServletRequest request) {
		
		TourManager t = new TourManager();
		t.setCode(request.getParameter("tourManager"));
		t.setFirstName(request.getParameter("firstName"));
        t.setLastName(request.getParameter("lastName"));
        t.setEmail(request.getParameter("email"));
        t.setPhone(request.getParameter("phone"));
        t.setCity(request.getParameter("city"));
        t.setDob(request.getParameter("dob"));
        t.setNid(request.getParameter("nid"));
        t.setjDate(request.getParameter("jDate"));
        return tourManagerDAO.save(t);
	}

	@Override
	public TourManager edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public TourManager getByTourManagerId(String id) {
        return tourManagerDAO.getByCode(id);

    }

	@Override
	public TourManager update(HttpServletRequest request) {
		
		TourManager t = new TourManager();
		t.setCode(request.getParameter("tourManager"));
		t.setFirstName(request.getParameter(""));
        t.setLastName(request.getParameter(""));
        t.setEmail(request.getParameter(""));
        t.setPhone(request.getParameter(""));
        t.setCity(request.getParameter(""));
        t.setDob(request.getParameter(""));
        t.setNid(request.getParameter(""));
        t.setjDate(request.getParameter(""));
        return tourManagerDAO.update(t);
	}

	@Override
	public List<TourManager> getAll() {
		
		return tourManagerDAO.getAll();
	}

	@Override
	public boolean delete(String id) {
		
		TourManager t = tourManagerDAO.getByCode(id);
		tourManagerDAO.delete(t);
		return true;
	}

    
    
}
