package com.smh.model;


public class PatientModel {
	private Long id;
	private Integer []testIds;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer[] getTestIds() {
		return testIds;
	}
	public void setTestIds(Integer[] testIds) {
		this.testIds = testIds;
	}
	
	
}
