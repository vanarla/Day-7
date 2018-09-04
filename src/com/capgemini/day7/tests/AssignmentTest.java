package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.Assignment;

class AssignmentTest {

		@Test
		void testAssignment() {
			Assignment a1 = null;
			Assignment a2 = null;
			Assignment a3 = null;
			Assignment a4 = null;
			File file = new File("C:\\Pallavi\\ExceptionHandling.txt");
			if (file.exists() && file.isFile()) {
				a1 = new Assignment(file, LocalDate.of(2018, 8, 22));
			}
			file = new File("C:\\Pallavi\\FileHandling.txt");
			if (file.exists() && file.isFile()) {
				a2 = new Assignment(file, LocalDate.of(2018, 9, 3));
			}
			file = new File("C:\\Pallavi\\Collection.txt");
			if (file.exists() && file.isFile()) {
				a3 = new Assignment(file, LocalDate.of(2019, 8, 26));
			}
			file = new File("C:\\Pallavi\\Bank Account.txt");
			if (file.exists() && file.isFile()) {
				a4 = new Assignment(file, LocalDate.of(2018, 8, 20));
			}
			assertEquals(true, Assignment.add(a1));
			assertEquals(true, Assignment.add(a2));
			assertEquals(true, Assignment.add(a3));
			assertEquals(true, Assignment.add(a4));
			assertEquals(true, Assignment.remove(a1));
			Assignment.show();
			System.out.println("\n");
			assertEquals(a4, Assignment.fetchEarlyDueDate());
		}
}
