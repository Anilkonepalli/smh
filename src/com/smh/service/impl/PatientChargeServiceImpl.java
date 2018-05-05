package com.smh.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.smh.dao.PatientChargeDao;
import com.smh.entity.Bed;
import com.smh.entity.BedCharge;
import com.smh.entity.Patient;
import com.smh.service.PatientChargeService;

@Service("patientChargeService")
@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
public class PatientChargeServiceImpl implements PatientChargeService {
	
	@Autowired
	private PatientChargeDao patientChargeDao;
	
	public void saveBedCharge(Patient patient){
		BedCharge bedCharge=new BedCharge();
		List<Bed> bedList=new ArrayList<Bed>();
		bedList.add(patient.getBed());
		bedCharge.setBed(bedList);
		bedCharge.setPatient(patient);
		patientChargeDao.saveBedCharge(bedCharge);
	}

	
}
