package com.capgemini.day7.domain;

import java.sql.Date;
import java.time.LocalDate;

public class TodayDate {
	

	public static String findTodaydate() {
		
		LocalDate.now();
		String today=LocalDate.now().getDayOfWeek()+","+LocalDate.now().getMonth()+" "+LocalDate.now().getDayOfMonth()+","+LocalDate.now().getYear();
		return today;
	
	}
	
	

}
