package com.springboot.htms.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.htms.dao.impl.IPackageOne;
import com.springboot.htms.entities.PackageOne;

@Repository(value = "packageDAO")
@Transactional
public class PackageDAO implements IPackageOne{

	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	
	public PackageOne save(PackageOne p) {
		
		getSession().saveOrUpdate(p);
    	getSession().flush();
    	return p;
	}
	
	public List<PackageOne> getAll() {

    	String sql = "from package";
        List<PackageOne> p = getSession().createQuery(sql).list();
        return p;
    }
	
	
	@Override
	public PackageOne getByCode(String code) {
		String sql = "from package where packagecode = '" + code + "'";
        List<PackageOne> p = getSession().createQuery(sql).list();
        return p.get(0);
	}
	
	public PackageOne delete(PackageOne p) {
        
    	getSession().delete(p);
        getSession().flush();
        return p;
    }


	@Override
	public PackageOne update(PackageOne t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
