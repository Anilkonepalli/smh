package com.smh.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class ChaildTestFee extends BaseEntity{
	private String testName;
	private String category;
	private Double fee;
	private String description;
	@Enumerated(EnumType.STRING)
	private BillingEnum billingEnum;
		
	@OneToMany(fetch=FetchType.EAGER)
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

		
	
	
}
