package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class StoolOccultBloodTest extends BaseEntity {
	
	private String microscopic;
	private String occultBlood;
	@OneToOne
	private TestFee testFee;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
	public String getMicroscopic() {
		return microscopic;
	}
	public void setMicroscopic(String microscopic) {
		this.microscopic = microscopic;
	}
	public String getOccultBlood() {
		return occultBlood;
	}
	public void setOccultBlood(String occultBlood) {
		this.occultBlood = occultBlood;
	}
	
	
}
