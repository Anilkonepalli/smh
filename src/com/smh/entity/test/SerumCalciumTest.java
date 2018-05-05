package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class SerumCalciumTest extends BaseEntity {
	
	
	@OneToOne
	private TestFee testFee;
	
	private String serumCalcium;
	
	
	

	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
	
	this.testFee = testFee;
	
	}
	public String getSerumCalcium() {
		return serumCalcium;
	}
	public void setSerumCalcium(String serumCalcium) {
		this.serumCalcium = serumCalcium;
	}
	
	
	
}
