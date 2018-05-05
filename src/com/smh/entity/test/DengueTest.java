package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class DengueTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String dengueNsAntigen;
	private String dengueIgG;
	private String dengueIgM;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getDengueNsAntigen() {
		return dengueNsAntigen;
	}
	public void setDengueNsAntigen(String dengueNsAntigen) {
		this.dengueNsAntigen = dengueNsAntigen;
	}
	public String getDengueIgG() {
		return dengueIgG;
	}
	public void setDengueIgG(String dengueIgG) {
		this.dengueIgG = dengueIgG;
	}
	public String getDengueIgM() {
		return dengueIgM;
	}
	public void setDengueIgM(String dengueIgM) {
		this.dengueIgM = dengueIgM;
	}
	
	
	

	}
	
	
	
	
