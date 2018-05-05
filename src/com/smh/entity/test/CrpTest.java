package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class CrpTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String crp;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getCrp() {
		return crp;
	}
	public void setCrp(String crp) {
		this.crp = crp;
	}
	
	
	
	}
	
	
	
	
