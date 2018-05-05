package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class CbpTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String heamoglobin;
	private String tlcCount;
	private String esr;
	private String plateletCount;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
	public String getHeamoglobin() {
		return heamoglobin;
	}
	public void setHeamoglobin(String heamoglobin) {
		this.heamoglobin = heamoglobin;
	}
	public String getTlcCount() {
		return tlcCount;
	}
	public void setTlcCount(String tlcCount) {
		this.tlcCount = tlcCount;
	}
	public String getEsr() {
		return esr;
	}
	public void setEsr(String esr) {
		this.esr = esr;
	}
	public String getPlateletCount() {
		return plateletCount;
	}
	public void setPlateletCount(String plateletCount) {
		this.plateletCount = plateletCount;
	}
	
	
	
}
