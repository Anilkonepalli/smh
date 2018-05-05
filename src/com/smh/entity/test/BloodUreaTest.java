package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class BloodUreaTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String bloodUrea;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getBloodUrea() {
		return bloodUrea;
	}
	public void setBloodUrea(String bloodUrea) {
		this.bloodUrea = bloodUrea;
	}
	
	
	}
	
	
	
	
