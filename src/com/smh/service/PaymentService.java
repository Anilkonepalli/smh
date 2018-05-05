package com.smh.service;

import java.util.Date;
import java.util.List;

import com.smh.entity.InPayments;
import com.smh.entity.OutPayments;

public interface PaymentService {

	public void savePayment(InPayments inPayments);
	public List<InPayments> getInPayments(Long id);
	public void saveOutPayment(OutPayments outPayments);
	List<InPayments> getAllInPayment(Date date);
	public List<OutPayments> getAllOutPayment(Date date);
}
