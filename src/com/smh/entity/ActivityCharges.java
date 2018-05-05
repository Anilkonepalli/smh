package com.smh.entity;

import javax.persistence.Entity;

/**
 * @author Anil
 * 
 */
@Entity
public class ActivityCharges extends BaseEntity {

	/**
	 * Private Attributes
	 */
	private static final long serialVersionUID = 8216544460809455947L;

	private String activityName;
	private String activityCharge;

	/*
	 * Setters and Getters
	 */
	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityCharge() {
		return activityCharge;
	}

	public void setActivityCharge(String activityCharge) {
		this.activityCharge = activityCharge;
	}

}
