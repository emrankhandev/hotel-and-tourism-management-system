package com.springboot.htms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.htms.dao.HotelDAO;
import com.springboot.htms.dao.RoomDAO;
import com.springboot.htms.entities.Room;
import com.springboot.htms.service.impl.IRoomService;


@Service(value = "roomService")
public class RoomService implements IRoomService{

	
	@Autowired
	HotelDAO hotelDAO;
	@Autowired
	RoomDAO roomDAO;
	
	@Override
	public Room save(HttpServletRequest request) {
		
		Room r = new Room();
		
		r.setHotelCode(request.getParameter("hotelCode"));
		r.setHotelName(request.getParameter("hotelName"));
		r.setRoomCode(request.getParameter("roomCode"));
		r.setRoomInfo(request.getParameter("roomInfo"));
		r.setRoomType(request.getParameter("roomType"));
		r.setPrice(Double.parseDouble(request.getParameter("price")));
		/* r.setStatus(request.getParameter("status")); */
		return roomDAO.save(r);
	}
	
	public Room getRoomByCode(String code) {
		return roomDAO.getByCode(code);
	}

	@Override
	public Room edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room update(HttpServletRequest request) {
		
		Room r = new Room();
		//r.setId(Integer.valueOf(request.getParameter("id")));
		r.setHotelName(request.getParameter("hotelName"));
		r.setRoomCode(request.getParameter("roomCode"));
		r.setRoomType(request.getParameter("roomType"));
		Double d = Double.valueOf(request.getParameter("price"));
		r.setPrice(d);
		r.setRoomInfo(request.getParameter("roomInfo"));
		r.setStatus(1);
		return roomDAO.update(r);
	}

	@Override
	public List<Room> getAll() {
		 
		return roomDAO.getAll();
	}

	@Override
	public boolean delete(String id) {
		
		Room r = roomDAO.getByCode(id);
		roomDAO.delete(r);
		return true;
	}
	
	public List<Room> getAvailable() {
		
		return roomDAO.getAvailable();
	}

}
