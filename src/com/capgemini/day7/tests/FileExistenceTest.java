package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistenceTest {

	@Test
	void testExistenceOfFile() {
		File file=new File("C:\\Pallavi\\Sample.txt");
		
		assertEquals(true,file.exists());
	}

}
