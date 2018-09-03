package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.FileOperations;

class FileOperationsTest {

	
		@Test
		void testReverse() {
	assertEquals(true, FileOperations.reverse("C:\\Pallavi\\Sample.txt","C:\\Pallavi\\ReverseOutput.txt"));
			assertEquals(true, FileOperations.convert("C:\\Pallavi\\Sample.txt","C:\\Pallavi\\ConvertOutput.txt"));
			assertEquals(true, FileOperations.compare("C:\\Pallavi\\Sample.txt","C:\\Pallavi\\WordCountTest.txt"));
		}
	}


