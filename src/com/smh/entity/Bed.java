package com.smh.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;

/**
 * @author Anil
 * 
 */
@Entity
public class Bed extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8171189379051888529L;
	/*
	 * Private Attributes
	 */
	@ManyToOne
	private Ward ward;
	private String bedNum;
	@Type(type="yes_no")
	private Boolean isAvailability = true;
	private Double fee;

	/*
	 * Setters and Getters
	 */
	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

	public String getBedNum() {
		return bedNum;
	}

	public void setBedNum(String bedNum) {
		this.bedNum = bedNum;
	}

	public Boolean getIsAvailability() {
		return isAvailability;
	}

	public void setIsAvailability(Boolean isAvailability) {
		this.isAvailability = isAvailability;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

}
