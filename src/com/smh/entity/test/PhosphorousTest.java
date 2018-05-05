package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class PhosphorousTest extends BaseEntity {
	
	
	@OneToOne
	private TestFee testFee;
	
	private String phosphorous;
	
	
	
	public String getPhosphorous() {
		return phosphorous;
	}
	public void setPhosphorous(String phosphorous) {
		this.phosphorous = phosphorous;
	}
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
	
	
	
}
