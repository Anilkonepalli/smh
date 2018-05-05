package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class RandomBloodSugarTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String randomBloodSugarTest;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getRandomBloosSugarTest() {
		return randomBloodSugarTest;
	}
	public void setRandomBloosSugarTest(String randomBloosSugarTest) {
		this.randomBloodSugarTest = randomBloosSugarTest;
	}
	
	
	
	
}
