package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.ValidateDate;

class ValidateTest {

	@Test
	void test() throws Exception {

		assertEquals("04/06/1997", ValidateDate.validate("02/06/1997",2));
	}

}
