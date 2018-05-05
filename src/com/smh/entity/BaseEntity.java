package com.smh.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Ramesh
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
	/**
	 * Private Attributes
	 */
	private static final long serialVersionUID = -2163470874721712682L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
