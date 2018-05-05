package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class SerumElectrolytes extends BaseEntity {
	
	
	@OneToOne
	private TestFee testFee;
	
	private String sodium;
	private String potassium;
	private String chlorides;
	
	
	
	
	
	public String getSodium() {
		return sodium;
	}
	public void setSodium(String sodium) {
		this.sodium = sodium;
	}
	public String getPotassium() {
		return potassium;
	}
	public void setPotassium(String potassium) {
		this.potassium = potassium;
	}
	public String getChlorides() {
		return chlorides;
	}
	public void setChlorides(String chlorides) {
		this.chlorides = chlorides;
	}
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
	
	
	
}
