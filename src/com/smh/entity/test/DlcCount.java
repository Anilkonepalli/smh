package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class DlcCount extends BaseEntity {
	
	
	@OneToOne
	private TestFee testFee;
	
	private String neutrophils;
	private String lymphocytes;
	private String eosinophils;
	private String monocytes;
	
	public String getNeutrophils() {
		return neutrophils;
	}
	public void setNeutrophils(String neutrophils) {
		this.neutrophils = neutrophils;
	}
	public String getLymphocytes() {
		return lymphocytes;
	}
	public void setLymphocytes(String lymphocytes) {
		this.lymphocytes = lymphocytes;
	}
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
	public String getEosinophils() {
		return eosinophils;
	}
	public void setEosinophils(String eosinophils) {
		this.eosinophils = eosinophils;
	}
	public String getMonocytes() {
		return monocytes;
	}
	public void setMonocytes(String monocytes) {
		this.monocytes = monocytes;
	}
	
	
	
}
