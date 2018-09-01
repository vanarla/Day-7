package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.PatternSearch;

class GrepClassTest {

	@Test
	void testPatternSearch() throws FileNotFoundException, IOException {
		File file = new File(
				"C:\\Users\\vanarla\\Documents\\workspace-sts-3.9.5.RELEASE\\Day6\\src\\com\\capgemini\\day6\\domain\\CellPhone.java");

		assertEquals("Line number 3 : import java.util.Objects;\n", PatternSearch.findString(file,"import"));
	}

}
