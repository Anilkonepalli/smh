package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class UrineExaminationTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	
	private String spGravity;
	private String colourAppearance;
	private String reaction;
	private String urinAlbumin;	
	private String sugar;
	private String ketones;
	private String bileSalts;
	private String bilePigments;
	private String urobilinogen;
	private String micro;


	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getSpGravity() {
		return spGravity;
	}
	public void setSpGravity(String spGravity) {
		this.spGravity = spGravity;
	}
	public String getColourAppearance() {
		return colourAppearance;
	}
	public void setColourAppearance(String colourAppearance) {
		this.colourAppearance = colourAppearance;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	public String getUrinAlbumin() {
		return urinAlbumin;
	}
	public void setUrinAlbumin(String urinAlbumin) {
		this.urinAlbumin = urinAlbumin;
	}
	public String getSugar() {
		return sugar;
	}
	public void setSugar(String sugar) {
		this.sugar = sugar;
	}
	public String getKetones() {
		return ketones;
	}
	public void setKetones(String ketones) {
		this.ketones = ketones;
	}
	public String getBileSalts() {
		return bileSalts;
	}
	public void setBileSalts(String bileSalts) {
		this.bileSalts = bileSalts;
	}
	public String getBilePigments() {
		return bilePigments;
	}
	public void setBilePigments(String bilePigments) {
		this.bilePigments = bilePigments;
	}
	public String getUrobilinogen() {
		return urobilinogen;
	}
	public void setUrobilinogen(String urobilinogen) {
		this.urobilinogen = urobilinogen;
	}
	public String getMicro() {
		return micro;
	}
	public void setMicro(String micro) {
		this.micro = micro;
	}
	

	}
	
	
	
	
