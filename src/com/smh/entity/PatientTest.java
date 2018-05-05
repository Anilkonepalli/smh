package com.smh.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class PatientTest extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7146534051866077494L;
	
	@ManyToMany(fetch=FetchType.EAGER) 
	@Fetch(value = FetchMode.SUBSELECT)
	private List<TestFee> testFee;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Patient> patientList;
	
	@Enumerated(EnumType.STRING)
	private TestStatusEnum status;

	public List<TestFee> getTestFee() {
		return testFee;
	}

	public void setTestFee(List<TestFee> testFee) {
		this.testFee = testFee;
	}

	public TestStatusEnum getStatus() {
		return status;
	}

	public void setStatus(TestStatusEnum status) {
		this.status = status;
	}

	public List<Patient> getPatientList() {
		return patientList;
	}
	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}

	

	
}
