package com.smh.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smh.dao.PaymentDao;
import com.smh.entity.InPayments;
import com.smh.entity.OutPayments;
import com.smh.util.DateUtil;
import com.smh.util.HibernateUtil;

@Repository("paymentDao")
public class PaymentDaoImpl implements PaymentDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	public void savePayment(InPayments inPayments){
		Session session=hibernateUtil.getSession();
		session.save(inPayments);
	}
	public List<InPayments> getInPayments(Long id){
		Session session=hibernateUtil.getSession();
		List<InPayments> inPaymentlist=session.createCriteria(InPayments.class).createCriteria("patient").add(Restrictions.eq("id", id)).list();
		return inPaymentlist;
	}
	public void saveOutPayment(OutPayments outPayments) {
		Session session=hibernateUtil.getSession();
		session.save(outPayments);
	}
	public List getAllInPayment(Date date) {
		Session session=hibernateUtil.getSession();
		
		List<InPayments> inPaymentsList=session.createCriteria(InPayments.class).add(Restrictions.ge("paymetnDate", date)).list();
		return inPaymentsList;
	}
	
	public List<OutPayments> getAllOutPayment(Date date) {
		Session session=hibernateUtil.getSession();
		
		List<OutPayments> outPaymentsList=session.createCriteria(OutPayments.class).add(Restrictions.ge("date", date)).list();
		return outPaymentsList;
	}
	
}
