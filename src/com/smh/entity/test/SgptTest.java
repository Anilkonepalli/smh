package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class SgptTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String alp;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getAlp() {
		return alp;
	}
	public void setAlp(String alp) {
		this.alp = alp;
	}
	
	

	}
	
	
	
	
