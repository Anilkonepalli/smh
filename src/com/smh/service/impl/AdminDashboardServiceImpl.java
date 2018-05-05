package com.smh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.smh.dao.AdminDashboardDao;
import com.smh.entity.Consultant;
import com.smh.entity.admin.Staff;
import com.smh.service.AdminDashboardService;

@Service("adminDashboardService")
@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
public class AdminDashboardServiceImpl implements AdminDashboardService {

	@Autowired
	AdminDashboardDao adminDashboardDao;
	
	public List<Staff> getAllStaff() {
		return adminDashboardDao.getAllStaff();
	}

	public void addStaff(Staff staff) {
		adminDashboardDao.addStaff(staff);
		
	}

	public void addConsultant(Consultant consultant) {
		adminDashboardDao.addConsultant(consultant);
	}
	public List<Consultant> getAllConsultant(){
		return adminDashboardDao.getAllConsultant();
	}
	public Consultant getLastConsultant(){
		return adminDashboardDao.getLastConsultant();
	}

}
