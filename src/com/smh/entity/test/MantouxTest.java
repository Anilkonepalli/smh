package com.smh.entity.test;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class MantouxTest extends BaseEntity {
	
	private Timestamp inTime;
	private Timestamp observedTime;
	private String result;
	@OneToOne
	private TestFee testFee;
	
	public Timestamp getInTime() {
		return inTime;
	}
	public void setInTime(Timestamp inTime) {
		this.inTime = inTime;
	}
	public Timestamp getObservedTime() {
		return observedTime;
	}
	public void setObservedTime(Timestamp observedTime) {
		this.observedTime = observedTime;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
	}
}
