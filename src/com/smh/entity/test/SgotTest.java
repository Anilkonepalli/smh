package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class SgotTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String sgot;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getSgot() {
		return sgot;
	}
	public void setSgot(String sgot) {
		this.sgot = sgot;
	}
	


	}
	
	
	
	
