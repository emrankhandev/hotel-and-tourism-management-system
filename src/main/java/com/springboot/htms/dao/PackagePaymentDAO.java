package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.IPackagePaymentDAO;
import com.springboot.htms.entities.PackagePayment;

@Repository(value = "packagePaymentDAO")
@Transactional
public class PackagePaymentDAO implements IPackagePaymentDAO{

	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
	@Override
	public PackagePayment save(PackagePayment t) {
		
		getSession().save(t);
    	getSession().flush();
        return t;
	}

	@Override
	public List<PackagePayment> getAll() {
		
		String sql = "from packagepayment";
        List<PackagePayment> packagepayment = getSession().createQuery(sql).list();
        return packagepayment;
	}

	@Override
	public PackagePayment getByCode(String code) {
		
		String sql = "from packagepayment where packagepaymentcode = '" + code + "'";
        List<PackagePayment> pPcode = getSession().createQuery(sql).list();
        return pPcode.get(0);
	}

	@Override
	public PackagePayment update(PackagePayment t) {
		
		getSession().saveOrUpdate(t);
        getSession().flush();
        return t;
	}

	@Override
	public PackagePayment delete(PackagePayment t) {
		
		getSession().delete(t);
        getSession().flush();
        return t;
	}

}
