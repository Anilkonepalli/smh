package com.smh.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class TestFee extends BaseEntity{
	private String testName;
	private String category;
	private Double fee;
	private String description;
	@Enumerated(EnumType.STRING)
	private BillingEnum billingEnum;
	@Enumerated(EnumType.STRING)
	private IndividualTestEnum individualTestEnum;
	@OneToMany(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<TestFee> testFeeList;
	
	@OneToMany(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<TestFields> testFields;

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public List<TestFields> getTestFields() {
		return testFields;
	}

	public void setTestFields(List<TestFields> testFields) {
		this.testFields = testFields;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BillingEnum getBillingEnum() {
		return billingEnum;
	}

	public void setBillingEnum(BillingEnum billingEnum) {
		this.billingEnum = billingEnum;
	}

	public List<TestFee> getTestFeeList() {
		return testFeeList;
	}

	public void setTestFeeList(List<TestFee> testFeeList) {
		this.testFeeList = testFeeList;
	}

	public IndividualTestEnum getIndividualTestEnum() {
		return individualTestEnum;
	}

	public void setIndividualTestEnum(IndividualTestEnum individualTestEnum) {
		this.individualTestEnum = individualTestEnum;
	}
	
}
