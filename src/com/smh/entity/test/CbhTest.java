package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class CbhTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String heamoglobin;
	private String tlcCount;
	private String esr;
	private String plateletCount;
	private String rbcCount;
	private String pcv;
	private String mcv;
	private String mch;
	private String mchc;
	
	
	
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
	
	public String getRbcCount() {
		return rbcCount;
	}
	public void setRbcCount(String rbcCount) {
		this.rbcCount = rbcCount;
	}
	public String getPcv() {
		return pcv;
	}
	public void setPcv(String pcv) {
		this.pcv = pcv;
	}
	public String getMcv() {
		return mcv;
	}
	public void setMcv(String mcv) {
		this.mcv = mcv;
	}
	public String getMch() {
		return mch;
	}
	public void setMch(String mch) {
		this.mch = mch;
	}
	public String getMchc() {
		return mchc;
	}
	public void setMchc(String mchc) {
		this.mchc = mchc;
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
