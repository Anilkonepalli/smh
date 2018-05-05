package com.smh.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Ramesh
 * 
 */
@Entity
public class BedCharge extends BaseEntity {

	/**
	 * Private Attributes
	 */
	private static final long serialVersionUID = -2390102257930203537L;

	@OneToMany
	private List<Bed> bed;
	private Integer noOfDays;
	private Double totalCharges;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Patient patient;

	/*
	 * Setters and Getters
	 */
	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Double getTotalCharges() {
		return totalCharges;
	}

	public void setTotalCharges(Double totalCharges) {
		this.totalCharges = totalCharges;
	}

	public List<Bed> getBed() {
		return bed;
	}

	public void setBed(List<Bed> bed) {
		this.bed = bed;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
