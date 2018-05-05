package com.smh.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smh.dao.PatientDao;
import com.smh.entity.Bed;
import com.smh.entity.Consultant;
import com.smh.entity.Patient;
import com.smh.entity.Ward;
import com.smh.util.HibernateUtil;

@Repository("patientDao")
public class PatientDaoImpl implements PatientDao {

	@Autowired
	HibernateUtil hibernateUtil;
	
	@SuppressWarnings("unchecked")
	public List<Consultant> getAllConsultant() {
		List<Consultant> conList = null;
		Session session = hibernateUtil.getSession();
		Query query = session.createSQLQuery("select * from consultant");
		conList = (List<Consultant>) query.list();
		return conList;
	}

	public void savePatient(Patient patient) {
		Session session=hibernateUtil.getSession();
		session.save(patient);
	}

	public List<Patient> listPatientByDate(Date date) {
		Session session=hibernateUtil.getSession();
		List<Patient> patientList=session.createCriteria(Patient.class).add(Restrictions.ge("registrationDate", date)).list();
		return patientList;
	}
	public List<Bed> getAllBeds() {
		List<Bed> bedList = null;
		Session session = hibernateUtil.getSession();
		Query query = session.createSQLQuery("select * from bed");
		bedList = (List<Bed>) query.list();
		return bedList;
	}
	
	public List<Ward> getWardNames() {
		Session session = hibernateUtil.getSession();
		List<Ward> wardList = session.createCriteria(Ward.class).list();
		return wardList;
	}
	public List<Bed> getAvailableBedByWardId(Long wardId){
		List<Bed> bedList = null;
		Session session = hibernateUtil.getSession();
		bedList=session.createCriteria(Bed.class).createCriteria("ward").add(Restrictions.eq("id", wardId)).list();
		return bedList;
	}
	public Patient getPatientById(Long id){
		Patient patient=null;
		Session session=hibernateUtil.getSession();
		patient=(Patient)session.get(Patient.class,id);
		return patient;
	}

	public List<Patient> getPatientNameList(String PatientName) {
		List<Patient> patientList=null;
		Session session=hibernateUtil.getSession();
		List<Patient> list = (List<Patient>)session.createCriteria(Patient.class).createCriteria("patientDetails").add(Restrictions.like("patientName", "%"+PatientName+"%")).list();
		patientList=list;
		/*
		 sess.createCriteria(Cat.class)
		    .add( Restrictions.like("name", "F%") )
		    .createCriteria("kittens")
		        .add( Restrictions.like("name", "F%") )
		    .list();*/
		return patientList;
	}
	public List<Patient> getPatientListByDate(Date date){
		Session session=hibernateUtil.getSession();
		List<Patient> patientList=session.createCriteria(Patient.class).add(Restrictions.ge("registrationDate", date)).list();
		return patientList;
	}
}
