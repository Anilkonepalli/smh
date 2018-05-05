package com.smh.entity;

import javax.persistence.Entity;

/**
 * @author Anil
 * 
 */
@Entity
public class Branch extends BaseEntity {

	private static final long serialVersionUID = -7061535818222520664L;
	/*
	 * Private Attributes
	 * 
	 */
	private String branchName;
	private String location;

	/*
	 * Setter and Getters
	 */
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
