package com.smh.util;

import java.io.Serializable;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.smh.entity.IdCreator;

public class RegIdGenerator implements IdentifierGenerator {

	public Serializable generate(SessionImplementor session, Object arg1)
			throws HibernateException {
		Connection connetion = session.connection();
		IdCreator idCreator=null;
		Query query=session.getNamedQuery("selectIdCreator").setLong("id", 1);
		SimpleDateFormat formatter1=new SimpleDateFormat("yyMMdd");
		Date date = new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		try{
		date=formatter.parse(formatter.format(date));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		idCreator=(IdCreator)query.list().get(0);
		if (idCreator == null) {
			idCreator.setPresentValue(1l);
			idCreator.setDate(date);
			String id = formatter1.format(idCreator.getDate())
			+ StringUtils.leftPad("" + idCreator.getPresentValue(), 3,
					'0');
			return Long.valueOf(id);
		} else {
			if (date.after(idCreator.getDate())) {
				Query namedQuery=session.getNamedQuery("updateIdCreator");
				idCreator.setPresentValue(1l);
				idCreator.setDate(date);
				namedQuery.setLong("presentValue", idCreator.getPresentValue());
				namedQuery.setDate("date", idCreator.getDate());
				namedQuery.setLong("id", new Long(1));
				namedQuery.executeUpdate();
				idCreator=(IdCreator)query.list().get(0);
				String id = formatter1.format(idCreator.getDate())
				+ StringUtils.leftPad("" + idCreator.getPresentValue(), 3,
						'0');
				return Long.valueOf(id);
			} else {
				Query namedQuery=session.getNamedQuery("updateIdCreator");
				idCreator.setPresentValue(idCreator.getPresentValue()+1);
				namedQuery.setLong("presentValue",idCreator.getPresentValue());
				namedQuery.setDate("date", idCreator.getDate());
				namedQuery.setLong("id", new Long(1));
				namedQuery.executeUpdate();
				idCreator=(IdCreator)query.list().get(0);
				
				String id = formatter1.format(idCreator.getDate())
				+ StringUtils.leftPad("" + idCreator.getPresentValue(), 3,
						'0');
				return Long.valueOf(id);
			}
		
		}
		//return null;
	}
}
