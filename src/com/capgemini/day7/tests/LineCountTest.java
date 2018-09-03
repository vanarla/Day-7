package com.capgemini.day7.tests;


import static org.junit.jupiter.api.Assertions.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.LineCount;

class LineCountTest {

	@Test
	void testNumberOfLines() {
		//File file=new File("C:\\Pallavi\\Sample.txt");
		assertEquals(17,LineCount.countLines("C\\Pallavi\\Sample.txt"));
	}

}
