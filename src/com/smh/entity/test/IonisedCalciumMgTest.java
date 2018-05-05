package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class IonisedCalciumMgTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String ionisedCalciumMg;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getIonisedCalciumMg() {
		return ionisedCalciumMg;
	}
	public void setIonisedCalciumMg(String ionisedCalciumMg) {
		this.ionisedCalciumMg = ionisedCalciumMg;
	}
		
	

	}
	
	
	
	
