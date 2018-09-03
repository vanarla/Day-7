package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.Search;

class SearchTest {

	
		@Test
		void testSearch() throws FileNotFoundException, IOException {
			File file = new File("C:\\Pallavi\\Sample.txt");

			assertEquals("Line number 3 : this is a sample\n", Search.findString(file,"this"));
		}
	}


