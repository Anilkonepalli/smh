package com.smh.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.smh.dao.PatientDao;
import com.smh.entity.Bed;
import com.smh.entity.Consultant;
import com.smh.entity.Patient;
import com.smh.entity.Ward;
import com.smh.service.PatientChargeService;
import com.smh.service.PatientService;

@Service("patientService")
@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientDao patientDao;
	
	@Autowired
	private PatientChargeService patientChargeService;
	
	public List<Consultant> getAllConsultant() {
		// TODO Auto-generated method stub
		return patientDao.getAllConsultant();
	}

	public void savePatient(Patient patient) {
		patientDao.savePatient(patient);
		if(patient.getBed()!=null){
			patientChargeService.saveBedCharge(patient);			
		}
	}

	public List<Patient> listPatientByDate(Date date) {

		return patientDao.listPatientByDate(date);
	}

	public List<Bed> getAllBeds() {
		return patientDao.getAllBeds();
	}
	
	public List<Ward> getWardNames(){
		return patientDao.getWardNames();
	}
	
	public List<Bed> getAvailableBedByWardId(Long wardId){
		return patientDao.getAvailableBedByWardId(wardId);
	}
	
	public Patient getPatientById(Long id){
		return patientDao.getPatientById(id);
	}
	
	public List<Patient> getPatientNameList(String PatientName){
		return patientDao.getPatientNameList(PatientName);
	}

	public List<Patient> getPatientListByDate(Date date) {
		return patientDao.getPatientListByDate(date);
	}
}
