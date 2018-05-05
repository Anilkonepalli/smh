package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class AsoTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String aso;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getAso() {
		return aso;
	}
	public void setAso(String aso) {
		this.aso = aso;
	}
	
	
	
	}
	
	
	
	
