package com.smh.dao;

import java.util.Date;
import java.util.List;

import com.smh.entity.InPayments;
import com.smh.entity.OutPayments;

public interface PaymentDao {
	
	public void savePayment(InPayments inPayments);
	public List<InPayments> getInPayments(Long id);
	public void saveOutPayment(OutPayments outPayments);
	public List<InPayments> getAllInPayment(Date date);
	public List<OutPayments> getAllOutPayment(Date date);
	
	
}
