package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.ITourDAO;
import com.springboot.htms.entities.Tour;

@Repository(value = "tourDAO")
@Transactional
public class TourDAO implements ITourDAO{
	
	@Autowired
    private EntityManager entityManager;

	private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	public Tour save(Tour t){
    	getSession().save(t);
    	getSession().flush();
        return t;
    }
	
	public List<Tour> getAll(){
    	String sql = "from tour";
        List<Tour> tour = getSession().createQuery(sql).list();
        return tour;
    }

	@Override
	public Tour getByCode(String code) {
		String sql = "from tour where code = '" + code + "'"; List<Tour> tList =
		getSession().createQuery(sql).list();
		return tList.get(0);
	}

    public Tour update(Tour t) {

        getSession().saveOrUpdate(t);
        getSession().flush();
        return t;
    }


    public Tour delete(Tour t) {
    	getSession().delete(t);
        getSession().flush();
        return t;
    }

	
}
