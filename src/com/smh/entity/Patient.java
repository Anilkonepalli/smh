package com.smh.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Anil
 * 
 */
@Entity
public class Patient implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7778116903936641272L;
	/*
	 * Private Attributes
	 */
	@Id
	@GenericGenerator(name="reg_id",strategy="com.smh.util.RegIdGenerator")
	@GeneratedValue(generator="reg_id")
	private Long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id")
	private PatientDetails patientDetails;
	
	@Temporal(TemporalType.DATE)
	private Date registrationDate=new Date();
	private Date dischargeDate;
	@Enumerated(EnumType.STRING)
	private PatientTypeEnum patientTypeEnum;
	@OneToOne
	private Bed bed;
	@OneToOne
	private Consultant consultant;
	private String refBy;
	private String refDocPh;
	
	@ManyToMany(fetch=FetchType.LAZY)
	private List<PatientTest> patientTest;

	/*
	 * Setters and Getters
	 */
	
	
	public PatientDetails getPatientDetails() {
		return patientDetails;
	}

	public void setPatientDetails(PatientDetails patientDetails) {
		this.patientDetails = patientDetails;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public PatientTypeEnum getPatientTypeEnum() {
		return patientTypeEnum;
	}

	public void setPatientTypeEnum(PatientTypeEnum patientTypeEnum) {
		this.patientTypeEnum = patientTypeEnum;
	}

	public Bed getBed() {
		return bed;
	}

	public void setBed(Bed bed) {
		this.bed = bed;
	}

	public Date getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public Long getId() {
		return id;
	}

	public Consultant getConsultant() {
		return consultant;
	}

	public void setConsultant(Consultant consultant) {
		this.consultant = consultant;
	}

	
	public List<PatientTest> getPatientTest() {
		return patientTest;
	}

	public void setPatientTest(List<PatientTest> patientTest) {
		this.patientTest = patientTest;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRefBy() {
		return refBy;
	}

	public void setRefBy(String refBy) {
		this.refBy = refBy;
	}

	public PatientTypeEnum[] getPatientTypeEnumValues(){
		return patientTypeEnum.values();
	}

	public String getRefDocPh() {
		return refDocPh;
	}

	public void setRefDocPh(String refDocPh) {
		this.refDocPh = refDocPh;
	}
	
}
