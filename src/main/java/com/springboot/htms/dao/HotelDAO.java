package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.IHotelDAO;
import com.springboot.htms.entities.Hotel;



@Repository(value = "hotelDAO")
@Transactional
public class HotelDAO implements IHotelDAO{

	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public Hotel save(Hotel h){
    	getSession().save(h);
    	getSession().flush();
        return h;
    }
    

    public List<Hotel> getAll(){
    	String sql = "from hotel";
        List<Hotel> hotel = getSession().createQuery(sql).list();
        return hotel;
    }

    @Override
	public Hotel getByCode(String code) {
		String sql = "from hotel where code = '" + code + "'";
        List<Hotel> hList = getSession().createQuery(sql).list();
        return hList.get(0);
	}

    public Hotel update(Hotel h) {
        
        getSession().saveOrUpdate(h);;        
        getSession().flush();
        return h;
    }


    public Hotel delete(Hotel h) {
    	getSession().delete(h);
        getSession().flush();
        return h;
    }	
	
}
