package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class SerumCreatinineTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String SerumCreatinine;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getSerumCreatinine() {
		return SerumCreatinine;
	}
	public void setSerumCreatinine(String serumCreatinine) {
		SerumCreatinine = serumCreatinine;
	}
	
	
	}
	
	
	
	
