package com.smh.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.hibernate.annotations.Type;

/**
 * @author Anil
 * 
 */
@Entity
public class PatientDetails extends BaseEntity {

	
	private static final long serialVersionUID = 1625868183756347507L;
	/*
	 * Private Attributes
	 */
	private String patientName;
	private String address;
	private String city;
	private String contactNo;
	@Enumerated(EnumType.STRING)
	private MaritalStatusEnum maritalStatusEnum;
	@Type(type="yes_no")
	private Boolean isArogyaSree = false;
	@Enumerated(EnumType.STRING)
	private GenderEnum genderEnum;
	private String guardianName;
	private String emergencyContact;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * Setters and Getters
	 */
	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public MaritalStatusEnum getMaritalStatusEnum() {
		return maritalStatusEnum;
	}

	public void setMaritalStatusEnum(MaritalStatusEnum maritalStatusEnum) {
		this.maritalStatusEnum = maritalStatusEnum;
	}

	public Boolean getIsArogyaSree() {
		return isArogyaSree;
	}

	public void setIsArogyaSree(Boolean isArogyaSree) {
		this.isArogyaSree = isArogyaSree;
	}

	public GenderEnum getGenderEnum() {
		return genderEnum;
	}

	public void setGenderEnum(GenderEnum genderEnum) {
		this.genderEnum = genderEnum;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

}
