package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.IPackageBookingDAO;
import com.springboot.htms.entities.PackageBooking;


@Repository(value = "packageBookingDAO")
@Transactional
public class PackageBookingDAO implements IPackageBookingDAO{

	@Autowired
	private EntityManager entityManager;
	
	private Session getSession() {
		
		return entityManager.unwrap(Session.class);
	}
	
	@Override
	public PackageBooking save(PackageBooking t) {
		
		getSession().save(t);
		getSession().flush();
		return t;
	}

	@Override
	public List<PackageBooking> getAll() {
		
		String sql = "from packageBooking";
		List<PackageBooking> packageBooking = getSession().createQuery(sql).list();
		return packageBooking;
	}

	@Override
	public PackageBooking getByCode(String code) {
		
		String sql = "from packageBooking where packagecode";
		List<PackageBooking> packageBooking = getSession().createQuery(sql).list();
		return packageBooking.get(0);
	}

	@Override
	public PackageBooking update(PackageBooking t) {
		
		getSession().saveOrUpdate(t);
        getSession().flush();
        return t;
	}

	@Override
	public PackageBooking delete(PackageBooking t) {
		
		getSession().delete(t);
        getSession().flush();
        return t;
	}

}
