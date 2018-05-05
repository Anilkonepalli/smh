package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class CtniTropiTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String ctniTropi;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getCtniTropi() {
		return ctniTropi;
	}
	public void setCtniTropi(String ctniTropi) {
		this.ctniTropi = ctniTropi;
	}
	
	


	}
	
	
	
	
