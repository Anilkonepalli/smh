package com.smh.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(
	name = "selectIdCreator",
	query = "from IdCreator s where s.id = :id"
	),
	@NamedQuery(
			name = "updateIdCreator",
			query = "update IdCreator s set s.date = :date,s.presentValue = :presentValue where s.id = :id"
	)
	
})

@Entity
public class IdCreator {

	@Id
	private Long id;
	private Date date;
	private Long presentValue;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getPresentValue() {
		return presentValue;
	}
	public void setPresentValue(Long presentValue) {
		this.presentValue = presentValue;
	}
	
	
}
