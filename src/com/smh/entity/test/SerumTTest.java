package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class SerumTTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	private String serumBilurubinD;
	private String serumBilirubinT;
	
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getSerumBilurubinD() {
		return serumBilurubinD;
	}
	public void setSerumBilurubinD(String serumBilurubinD) {
		this.serumBilurubinD = serumBilurubinD;
	}
	public String getSerumBilirubinT() {
		return serumBilirubinT;
	}
	public void setSerumBilirubinT(String serumBilirubinT) {
		this.serumBilirubinT = serumBilirubinT;
	}
	

	}
	
	
	
	
