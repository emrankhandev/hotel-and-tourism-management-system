package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.IPlaceDAO;
import com.springboot.htms.entities.Place;

@Repository(value = "placeDAO")
@Transactional
public class PlaceDAO implements IPlaceDAO{

	@Autowired
	private EntityManager entityManager;
	
	private Session getSession() {
		
		return entityManager.unwrap(Session.class);
	}
	
	public Place save(Place p) {
		
		getSession().save(p);
		getSession().flush();
		return p;
	}
	
	public List<Place> getAll() {
		
		String sql = "from place";
		List<Place> place = getSession().createQuery(sql).list();
		return place;
	}
	
	public Place update(Place p) {
       
		getSession().saveOrUpdate(p);
        getSession().flush();
        return p;
    }
	
	public Place delete(Place p) {
    	
        getSession().delete(p);
        getSession().flush();
        return p;
    }

	@Override
	public Place getByCode(String code) {
		
		String sql = "from place where code = '" + code + "'";
		List<Place> pList = getSession().createQuery(sql).list();
		return pList.get(0);
	}
}
