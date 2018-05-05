package com.smh.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date getTodayDate(){
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
		try{
		date=formatter.parse(formatter.format(date));
		}
		catch (Exception e) {
			
		}
		return date;
	}
	public static Date convertStringToDate(String sdate){
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
		try{
		date=formatter.parse(sdate);
		}
		catch (Exception e) {
			
		}
		return date;
	}
	public static String convertDateToString(Date date){
		SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
		String sdate=null;
		try{
		sdate=formatter.format(date);
		}
		catch (Exception e) {
			
		}
		return sdate;
	}

}
