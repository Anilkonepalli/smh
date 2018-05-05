package com.smh.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * @author Anil
 *
 */
@Entity
public class Ward extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6617073945058748702L;

	/*
	 * private Attributes
	 */
	private String description;

	@ManyToOne
	private Branch branch;

	/*
	 * Setter and Getters
	 * 
	 */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
