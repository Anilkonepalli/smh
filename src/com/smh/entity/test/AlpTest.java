package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class AlpTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String sgpt;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getSgpt() {
		return sgpt;
	}
	public void setSgpt(String sgpt) {
		this.sgpt = sgpt;
	}

	

	}
	
	
	
	
