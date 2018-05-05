package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class HbsAgTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String hbsAgTest;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getHbsAgTest() {
		return hbsAgTest;
	}
	public void setHbsAgTest(String hbsAgTest) {
		this.hbsAgTest = hbsAgTest;
	}
	
	
	}
	
	
	
	
