package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class SerumUricAcidTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String serumUricAcid;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getSerumUricAcid() {
		return serumUricAcid;
	}
	public void setSerumUricAcid(String serumUricAcid) {
		this.serumUricAcid = serumUricAcid;
	}
	


	}
	
	
	
	
