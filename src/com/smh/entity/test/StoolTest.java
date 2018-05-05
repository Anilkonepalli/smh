package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class StoolTest extends BaseEntity {
	
	
	private String macroscopic;
	private String reaction;
	@OneToOne
	private TestFee testFee;
	
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
	public String getMacroscopic() {
		return macroscopic;
	}
	public void setMacroscopic(String macroscopic) {
		this.macroscopic = macroscopic;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}

	
}
