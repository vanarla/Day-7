package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.Assignment;

class AssignmentTest {

		@Test
		void testAssignment() {
			Assignment assign1 = null;
			Assignment assign2 = null;
			Assignment assign3 = null;
			Assignment assign4 = null;
			File file = new File("C:\\Pallavi\\ExceptionHandling.txt");
			if (file.exists() && file.isFile()) {
				assign1 = new Assignment(file, LocalDate.of(2018, 8, 22));
			}
			file = new File("C:\\Pallavi\\FileHandling.txt");
			if (file.exists() && file.isFile()) {
				assign2 = new Assignment(file, LocalDate.of(2018, 9, 3));
			}
			file = new File("C:\\Pallavi\\Collection.txt");
			if (file.exists() && file.isFile()) {
				assign3 = new Assignment(file, LocalDate.of(2019, 8, 26));
			}
			file = new File("C:\\Pallavi\\Bank Account.txt");
			if (file.exists() && file.isFile()) {
				assign4 = new Assignment(file, LocalDate.of(2018, 8, 20));
			}
			assertEquals(true, Assignment.add(assign1));
			assertEquals(true, Assignment.add(assign2));
			assertEquals(true, Assignment.add(assign3));
			assertEquals(true, Assignment.add(assign4));
			assertEquals(true, Assignment.remove(assign1));
			Assignment.show();
			System.out.println("\n");
			assertEquals(assign4, Assignment.fetchEarlyDueDate());
		}
}
