package com.smh.entity.test;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.smh.entity.BaseEntity;
import com.smh.entity.TestFee;

@Entity
public class LftTest extends BaseEntity{
	
	@OneToOne
	private TestFee testFee;
	private String serumBilurubinD;
	private String serumBilirubinT;
	private String totalProteins;
	private String albumin;
	private String globulin;
	private String agRatio;
	
	
	public TestFee getTestFee() {
		return testFee;
	}
	public void setTestFee(TestFee testFee) {
		this.testFee = testFee;
		
	}
	public String getSerumBilurubinD() {
		return serumBilurubinD;
	}
	public void setSerumBilurubinD(String serumBilurubinD) {
		this.serumBilurubinD = serumBilurubinD;
	}
	public String getSerumBilirubinT() {
		return serumBilirubinT;
	}
	public void setSerumBilirubinT(String serumBilirubinT) {
		this.serumBilirubinT = serumBilirubinT;
	}
	public String getTotalProteins() {
		return totalProteins;
	}
	public void setTotalProteins(String totalProteins) {
		this.totalProteins = totalProteins;
	}
	public String getAlbumin() {
		return albumin;
	}
	public void setAlbumin(String albumin) {
		this.albumin = albumin;
	}
	public String getGlobulin() {
		return globulin;
	}
	public void setGlobulin(String globulin) {
		this.globulin = globulin;
	}
	public String getAgRatio() {
		return agRatio;
	}
	public void setAgRatio(String agRatio) {
		this.agRatio = agRatio;
	}



	}
	
	
	
	
