package com.smh.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HibernateUtil {
	
	@Autowired
	private  SessionFactory sessionFactory;
	private  Session session;
	public  Session getSession(){
		
		if(sessionFactory!=null){
			if(session!=null){
				session=sessionFactory.getCurrentSession();
			}
			else{
				session=sessionFactory.openSession();
			}
		}
		return session;
	}
}
