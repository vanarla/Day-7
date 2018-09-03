package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.BinaryInteger;

class BinaryTest {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\Pallavi\\CreateData.dat");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}

}
