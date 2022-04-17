package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.IFoodDAO;
import com.springboot.htms.entities.Food;

@Repository(value = "foodDAO")
@Transactional
public class FoodDAO implements IFoodDAO{

	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public Food save(Food h){
    	getSession().save(h);
    	getSession().flush();
        return h;
    }
    

    public List<Food> getAll(){
    	String sql = "from food";
        List<Food> food = getSession().createQuery(sql).list();
        return food;
    }

    @Override
	public Food getByCode(String code) {
		String sql = "from food where code = '" + code + "'";
        List<Food> fList = getSession().createQuery(sql).list();
        return fList.get(0);
	}

    
    public Food update(Food f) {
    	getSession().saveOrUpdate(f);
        getSession().flush();
        return f;
    }


    public Food delete(Food f) {
    	getSession().delete(f);
        getSession().flush();
        return f;
    }

	
}
