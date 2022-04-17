package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.IPaymentDAO;
import com.springboot.htms.entities.Payment;


@Repository(value = "paymentDAO")
@Transactional
public class PaymentDAO implements IPaymentDAO{

	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
	@Override
	public Payment save(Payment t) {
		
		getSession().save(t);
    	getSession().flush();
        return t;
	}

	@Override
	public List<Payment> getAll() {
		
		String sql = "from payment";
        List<Payment> payment = getSession().createQuery(sql).list();
        return payment;
	}

	@Override
	public Payment getByCode(String code) {
		
		String sql = "from payment where paymentcode = '" + code + "'";
        List<Payment> pList = getSession().createQuery(sql).list();
        return pList.get(0);
	}

	@Override
	public Payment update(Payment t) {
		
		getSession().saveOrUpdate(t);;        
        getSession().flush();
        return t;
	}

	@Override
	public Payment delete(Payment t) {
		
		getSession().delete(t);
        getSession().flush();
        return t;
	}

}
