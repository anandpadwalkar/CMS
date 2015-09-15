package com.iitms.cms.transactions.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iitms.cms.transactions.entity.ComplaintRegisterEntity;

@Repository
public class ComplaintRegisterDaoImpl implements ComplaintRegisterDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addComplaint(ComplaintRegisterEntity entity) {
		this.sessionFactory.getCurrentSession().save(entity);
		return true;
	}

	
}
