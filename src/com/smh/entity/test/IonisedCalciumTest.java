package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class IonisedCalciumTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String ionisedCalcium;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getIonisedCalcium() {
		return ionisedCalcium;
	}
	public void setIonisedCalcium(String ionisedCalcium) {
		this.ionisedCalcium = ionisedCalcium;
	}
	
	

	}
	
	
	
	
