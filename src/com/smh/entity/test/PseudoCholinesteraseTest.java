package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class PseudoCholinesteraseTest extends BaseEntity {
	
	
	@OneToOne
	private TestFee testFee;
	private String pseudoCholinesterase;
	
	
	
	
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
	public String getPseudoCholinesterase() {
		return pseudoCholinesterase;
	}
	public void setPseudoCholinesterase(String pseudoCholinesterase) {
		this.pseudoCholinesterase = pseudoCholinesterase;
	}
	
	
	
	
}
