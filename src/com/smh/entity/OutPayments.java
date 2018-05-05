package com.smh.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Transient;

import com.smh.util.DateUtil;

/**
 * @author Anil
 *
 */
@Entity
public class OutPayments  extends BaseEntity{
	
	private Long staffId;
	private Date date;
	private String reason;
	private String name;
	private Double amount;
	private OutPaymentTypeEnum outPaymentTypeEnum;
	private String chqNo;
	private String ddNo;
	private String bankName;
	@Transient
	private String sdate;
	public Long getStaffId() {
		return staffId;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public OutPaymentTypeEnum getOutPaymentTypeEnum() {
		return outPaymentTypeEnum;
	}
	public void setOutPaymentTypeEnum(OutPaymentTypeEnum outPaymentTypeEnum) {
		this.outPaymentTypeEnum = outPaymentTypeEnum;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getChqNo() {
		return chqNo;
	}
	public void setChqNo(String chqNo) {
		this.chqNo = chqNo;
	}
	public String getDdNo() {
		return ddNo;
	}
	public void setDdNo(String ddNo) {
		this.ddNo = ddNo;
	}
	public String getSdate(){
		return DateUtil.convertDateToString(date);
	}
}
