package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.Vowels;

class VowelsTest {

	@Test
	void testVowels() throws IOException {
		File file = new File(
				"C:\\Pallavi\\Vowels.txt");

		assertEquals("Number of vowels = 13\nNumber of consonants = 24", Vowels.findVowelAndConsonant(file));
	}


}
