package com.smh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smh.dao.AdminDashboardDao;
import com.smh.entity.Consultant;
import com.smh.entity.admin.Staff;
import com.smh.util.HibernateUtil;

@Repository("adminDashboardDao")
public class AdminDashboardDaoImpl implements AdminDashboardDao {
	
	@Autowired
	HibernateUtil hibernateUtil;
	
	public List<Staff> getAllStaff(){
		Session session=hibernateUtil.getSession();
		return (List<Staff>)session.createCriteria(Staff.class).list();
	}

	public void addStaff(Staff staff) {
        Session session=hibernateUtil.getSession();
        session.save(staff);
		
	}

	public void addConsultant(Consultant consultant) {
		Session session=hibernateUtil.getSession();
		session.save(consultant);
	}
	
	public List<Consultant> getAllConsultant(){
		Session session=hibernateUtil.getSession();
		return (List<Consultant>)session.createCriteria(Consultant.class).list();
	}
	
	public Consultant getLastConsultant(){
		Session session=hibernateUtil.getSession();
		return (Consultant)session.createCriteria(Consultant.class).addOrder(Order.desc("id")).list().get(0);
	}
}
