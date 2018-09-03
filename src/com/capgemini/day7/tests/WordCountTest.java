package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.WordCount;

class WordCountTest {

	@Test
	void testNumberOfWords() throws IOException {
		
		File file=new File("C:\\Pallavi\\Sample.txt");
		assertEquals(32,WordCount.countNumberOfWords(file));
	}

}
