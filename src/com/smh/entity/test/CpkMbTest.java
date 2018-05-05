package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class CpkMbTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String cpkMb;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getCpkMb() {
		return cpkMb;
	}
	public void setCpkMb(String cpkMb) {
		this.cpkMb = cpkMb;
	}


	}
	
	
	
	
