package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class FbsTest extends BaseEntity {
	
	
	@OneToOne
	private TestFee testFee;
	
	private String fastingBloodSugar;
	
	
	
	public String getFastingBloodSugar() {
		return fastingBloodSugar;
	}
	public void setFastingBloodSugar(String fastingBloodSugar) {
		this.fastingBloodSugar = fastingBloodSugar;
	}
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
	
	
	
}
