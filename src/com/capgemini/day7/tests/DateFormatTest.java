package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import com.capgemini.day7.domain.DateFormat;

import org.junit.jupiter.api.Test;

class DateFormatTest {

	
	@Test
	void testbasic() {

		//Date d1 = new Date(19970602);
		String date="02061997";
		assertEquals("02/06/1997",DateFormat.convertFormatOne(date));
		
	}

	
	@Test
	void testformat() {

		//Date d1 = new Date(19970602);
		String date="02061997";
		assertEquals("02 jun,1997",DateFormat.convertFormatTwo(date));
		
	}


	}


