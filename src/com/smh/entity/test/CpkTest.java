package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class CpkTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String cpk;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getCpk() {
		return cpk;
	}
	public void setCpk(String cpk) {
		this.cpk = cpk;
	
	}


	}
	
	
	
	
