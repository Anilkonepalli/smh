package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class PTTest extends BaseEntity {
	
	
	@OneToOne
	private TestFee testFee;
	
	private String test;
	private String contorl;
	private String INR;
	
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getContorl() {
		return contorl;
	}
	public void setContorl(String contorl) {
		this.contorl = contorl;
	}
	public String getINR() {
		return INR;
	}
	public void setINR(String inr) {
		INR = inr;
	}
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
	
	
	
}
