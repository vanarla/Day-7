package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.MagicDate;

class MagicTest {

	@Test
	void testCheckIfMagicDate() {
		MagicDate date1=new MagicDate() ;
		assertEquals("magic",date1.checkIfMagicDate(LocalDate.of(30,6,5))) ;
	}

}
