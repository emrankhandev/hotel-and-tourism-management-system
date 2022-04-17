package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.IRoomDAO;
import com.springboot.htms.entities.Room;

@Repository(value = "roomDAO")
@Transactional
public class RoomDAO implements IRoomDAO{

	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public Room save(Room h){
    	getSession().save(h);
    	getSession().flush();
        return h;
    }
    

    public List<Room> getAll(){
    	String sql = "from room";
        List<Room> room = getSession().createQuery(sql).list();
        return room;
    }

    @Override
	public Room getByCode(String code) {
		String sql = "from room where roomCode = '" + code + "'";
        List<Room> hList = getSession().createQuery(sql).list();
        return hList.get(0);
	}

    public Room update(Room h) {
    	
        getSession().saveOrUpdate(h);
        getSession().flush();
        return h;
    }


    public Room delete(Room h) {
    	
    	getSession().delete(h);
        getSession().flush();
        return h;
    }

    public List<Room> getAvailable() {
    	
    	String sql = "from room where status = :roomstatus";
    	Query query = getSession().createQuery(sql);
        query.setParameter("roomstatus", 1);
        List<Room> roomB = query.list();
        getSession().flush();
    	return roomB;
    }
	
}
