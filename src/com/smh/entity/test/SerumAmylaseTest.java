package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class SerumAmylaseTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String serumAmylase;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getSerumAmylase() {
		return serumAmylase;
	}
	public void setSerumAmylase(String serumAmylase) {
		this.serumAmylase = serumAmylase;
	}
	
	
	

	}
	
	
	
	
