package com.smh.service;

import java.util.List;

import org.hibernate.Session;

import com.smh.entity.Patient;
import com.smh.entity.PatientTest;
import com.smh.entity.TestFee;
import com.smh.entity.test.PatientTestResult;

public interface LabDashboardService {
	
	public List<Patient> listPatient();
	public List<TestFee> listOfTest();
	public void savePatientTest(PatientTest patientTest);
	public TestFee getTestFeeById(Integer id);
	public Patient getPatientById(Long id);
	public PatientTest getPatientTest(Long id);
	public List<PatientTest> getPatientTestList();
	public void savePatientTestResult(PatientTestResult patientTestResult);
	public List<PatientTestResult> getPatientTestResultById(Long id);
	
}
