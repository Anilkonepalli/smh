package com.smh.dao.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smh.dao.PatientChargeDao;
import com.smh.entity.BedCharge;
import com.smh.entity.Patient;
import com.smh.util.HibernateUtil;

@Repository("patientChargeDao")
public class PatientChargeDaoImpl implements PatientChargeDao {

	@Autowired
	HibernateUtil hibernateUtil;
	
	public void saveBedCharge(BedCharge	bedCharge){
		 Session session=hibernateUtil.getSession();
		 session.save(bedCharge);
	}

}
