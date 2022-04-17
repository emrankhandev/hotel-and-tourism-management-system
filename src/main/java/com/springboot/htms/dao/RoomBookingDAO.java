package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.IRoomBookingDAO;
import com.springboot.htms.entities.RoomBooking;

@Repository(value = "roomBookingDAO")
@Transactional
public class RoomBookingDAO implements IRoomBookingDAO{

	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
    public RoomBooking save(RoomBooking t) {
    	
    	getSession().save(t);
    	getSession().flush();
        return t;

    }
  
    public RoomBooking update(RoomBooking t) {
        
    	getSession().saveOrUpdate(t);
    	getSession().flush();
    	return t;

    }

   
    public List<RoomBooking> getAll() {

    	String sql = "from room_booking";
        List<RoomBooking> r = getSession().createQuery(sql).list();
        return r;
    }

    
    @Override
	public RoomBooking getByCode(String code) {
		
		String sql = "from room_booking where roomcode = '" + code + "'";
        List<RoomBooking> rb = getSession().createQuery(sql).list();
        return rb.get(0);
	}
    
    public RoomBooking delete(RoomBooking rb) {
        
    	getSession().delete(rb);
        getSession().flush();
        return rb;
    }
    
    public List<RoomBooking> getBooked() {
    	
    	String sql = "from room_booking where roomstatus = :roomstatus";
    	Query query = getSession().createQuery(sql);
        query.setParameter("roomstatus", "Booked");
        List<RoomBooking> roomBooking = query.list();
        getSession().flush();
    	return roomBooking;
    }
    
	/*
	 * public List<RoomBooking> getAvailable() {
	 * 
	 * String sql = "from room_booking where roomstatus = :roomstatus"; Query query
	 * = getSession().createQuery(sql); query.setParameter("roomstatus",
	 * "Available"); List<RoomBooking> roomBooking = query.list();
	 * getSession().flush(); return roomBooking; }
	 */
    
}
