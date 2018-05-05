package com.smh.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.smh.util.DateUtil;

/**
 * @author Anil
 *
 */
@Entity
public class InPayments extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8410111372105283504L;

	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Patient patient;
	private Double totalAmount;
	private Double paymentAmt;
	
	@Enumerated(EnumType.STRING)
	private PaymentTypeEnum paymentTypeEnum;
	private Date paymetnDate;
	private Double due;
	@Transient
	private String sdate;
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getDue() {
		return due;
	}
	public void setDue(Double due) {
		this.due = due;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Double getPaymentAmt() {
		return paymentAmt;
	}
	public void setPaymentAmt(Double paymentAmt) {
		this.paymentAmt = paymentAmt;
	}
	public PaymentTypeEnum getPaymentTypeEnum() {
		return paymentTypeEnum;
	}
	public void setPaymentTypeEnum(PaymentTypeEnum paymentTypeEnum) {
		this.paymentTypeEnum = paymentTypeEnum;
	}
	public Date getPaymetnDate() {
		return paymetnDate;
	}
	public void setPaymetnDate(Date paymetnDate) {
		this.paymetnDate = paymetnDate;
	}
	public String getSdate(){
		return DateUtil.convertDateToString(paymetnDate);
	}
}
