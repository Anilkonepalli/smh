package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class VdrlTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String vdrl;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getVdrl() {
		return vdrl;
	}
	public void setVdrl(String vdrl) {
		this.vdrl = vdrl;
	}
	
	
	
	}
	
	
	
	
