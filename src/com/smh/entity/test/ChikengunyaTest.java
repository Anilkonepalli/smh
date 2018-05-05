package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class ChikengunyaTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String chikengunya;
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getChikengunya() {
		return chikengunya;
	}
	public void setChikengunya(String chikengunya) {
		this.chikengunya = chikengunya;
	}
	
	
	}
	
	
	
	
