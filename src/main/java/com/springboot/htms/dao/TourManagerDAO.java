/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.ITourManagerDAO;
import com.springboot.htms.entities.TourManager;


@Repository(value = "tourManagerDAO")
@Transactional

public class TourManagerDAO implements ITourManagerDAO{

    @Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    
    public TourManager save(TourManager t) {     
    	getSession().save(t);
        getSession().flush();
        return t;

    }

    
    public TourManager update(TourManager t) {
    	
    	getSession().saveOrUpdate(t);
		getSession().flush();
		return t;
    
    }

    
    public List<TourManager> getAll() {
     
    	String sql = "from tourManager";
        List<TourManager> tm = getSession().createQuery(sql).list();
        return tm;
    
    }

   
    @Override
	public TourManager getByCode(String code) {
		
		String sql = "from tourManager where code = '" + code + "'";
		List<TourManager> tourManager = getSession().createQuery(sql).list();
		return tourManager.get(0);
	}

    
    public TourManager delete(TourManager t) {
      
    	getSession().delete(t);
		getSession().flush();
		return t;
    }


	

}
