package com.smh.entity;

import javax.persistence.Entity;

@Entity
public class TestFields extends BaseEntity{
	private String fieldType;
	private String fieldName;
	private String propName;
	private String normalRanges;
	private String units;
	private String defaultValue;
	
	public TestFields() {
	
	}
	public TestFields(String fieldType,String fieldName,String propName,String normalRanges,String units,String defaultValue){
		this.fieldName=fieldName;
		this.fieldType=fieldType;
		this.propName=propName;
		this.normalRanges=normalRanges;
		this.units=units;
		this.defaultValue=defaultValue;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getFieldType() {
		return fieldType;
	}
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getPropName() {
		return propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}
	public String getNormalRanges() {
		return normalRanges;
	}
	public void setNormalRanges(String normalRanges) {
		this.normalRanges = normalRanges;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	
}
