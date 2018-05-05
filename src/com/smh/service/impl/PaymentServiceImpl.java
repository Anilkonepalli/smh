package com.smh.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.smh.dao.PaymentDao;
import com.smh.entity.InPayments;
import com.smh.entity.OutPayments;
import com.smh.service.PaymentService;

@Service("paymentService")
@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentDao paymentDao;
	
	public void savePayment(InPayments inPayments){
		paymentDao.savePayment(inPayments);
	}
	
	public List<InPayments> getInPayments(Long id){
		return paymentDao.getInPayments(id);
	}

	public void saveOutPayment(OutPayments outPayments) {
		paymentDao.saveOutPayment(outPayments);
	}
	
	public List<InPayments> getAllInPayment(Date date){
		
		return paymentDao.getAllInPayment(date);
	}

	public List<OutPayments> getAllOutPayment(Date date) {
		return paymentDao.getAllOutPayment(date);
	}
}
