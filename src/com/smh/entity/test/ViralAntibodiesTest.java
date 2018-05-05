package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class ViralAntibodiesTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String viralAntibodies;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getViralAntibodies() {
		return viralAntibodies;
	}
	public void setViralAntibodies(String viralAntibodies) {
		this.viralAntibodies = viralAntibodies;
	}
	
	
	}
	
	
	
	
