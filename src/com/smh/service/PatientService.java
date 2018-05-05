package com.smh.service;

import java.util.Date;
import java.util.List;

import com.smh.entity.Bed;
import com.smh.entity.Consultant;
import com.smh.entity.Patient;
import com.smh.entity.Ward;

public interface PatientService {
	public List<Consultant> getAllConsultant();
	public void savePatient(Patient patient);
	public List<Patient> listPatientByDate(Date date);
	public List<Bed> getAllBeds();
	public List<Ward> getWardNames();
	public List<Bed> getAvailableBedByWardId(Long wardId);
	public Patient getPatientById(Long id);
	public List<Patient> getPatientNameList(String patientName);
	public List<Patient> getPatientListByDate(Date date);
}
