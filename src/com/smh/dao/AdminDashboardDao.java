package com.smh.dao;

import java.util.List;

import com.smh.entity.Consultant;
import com.smh.entity.admin.Staff;

public interface AdminDashboardDao {
	public List<Staff> getAllStaff() ;
	
	public void addStaff(Staff staff);
	public void addConsultant(Consultant consultant);
	public List<Consultant> getAllConsultant();
	public Consultant getLastConsultant();
}
