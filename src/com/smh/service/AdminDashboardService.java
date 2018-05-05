package com.smh.service;

import java.util.List;

import com.smh.entity.Consultant;
import com.smh.entity.admin.Staff;

public interface AdminDashboardService {
	public List<Staff> getAllStaff();
	public void addStaff(Staff staff);
	public void addConsultant(Consultant consultant);
	public List<Consultant> getAllConsultant();
	public Consultant getLastConsultant();
}
