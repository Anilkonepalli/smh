package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class RaFactorTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String raFactor;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getRaFactor() {
		return raFactor;
	}
	public void setRaFactor(String raFactor) {
		this.raFactor = raFactor;
	}
	
	
	}
	
	
	
	
