package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class PpBloodSugarTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String ppBloodSugar;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getPpBloodSugar() {
		return ppBloodSugar;
	}
	public void setPpBloodSugar(String ppBloodSugar) {
		this.ppBloodSugar = ppBloodSugar;
	}
	
	


	}
	
	
	
	
