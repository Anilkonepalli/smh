package com.smh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.smh.dao.LabDashboardDao;
import com.smh.entity.Patient;
import com.smh.entity.PatientTest;
import com.smh.entity.TestFee;
import com.smh.entity.test.PatientTestResult;
import com.smh.service.LabDashboardService;

@Service("labDashboardService")
@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
public class LabDashboardServiceImpl implements LabDashboardService {

	@Autowired
	private LabDashboardDao labDashboardDao;
	
	public List<Patient> listPatient() {
		
		return null;
	}

	public List<TestFee> listOfTest(){
		return labDashboardDao.listOfTest();
	}

	public void savePatientTest(PatientTest patientTest) {
	
		labDashboardDao.savePatientTest(patientTest);
	}

	public Patient getPatientById(Long id){
		return labDashboardDao.getPatientById(id);
	}
	
	public TestFee getTestFeeById(Integer id) {
		return labDashboardDao.getTestFeeById(id);
	}

	public PatientTest getPatientTest(Long id) {
		return labDashboardDao.getPatientTest(id);
	}

	public List<PatientTest> getPatientTestList() {
		return labDashboardDao.getPatientTestList();
	}

	public void savePatientTestResult(PatientTestResult patientTestResult) {
		labDashboardDao.savePatientTestResult(patientTestResult);
	}

	public List<PatientTestResult> getPatientTestResultById(Long id) {
		return labDashboardDao.getPatientTestResultById(id);
	}
	
	
}
