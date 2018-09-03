package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class RandomNumberTest {

	@Test
	void testRandomNumber() {
	Random rand = new Random();
	File file = new File("C:\\Pallavi\\test.txt");{
	
	try(PrintWriter print = new PrintWriter(file))
	{
		// Random rand = new Random();
		for (int i = 0; i < 100; i++) {

			print.println(rand.nextInt(50) + 1);
			System.out.println(i);
		}
	} catch (FileNotFoundException e1) {
		
		e1.printStackTrace();
	}

	TreeSet<Integer> treeset = new TreeSet<>();try(
	FileReader reader = new FileReader(file);
	BufferedReader br = new BufferedReader(reader))
	{
		String line;
		while ((line = br.readLine()) != null) {
			treeset.add(Integer.parseInt(line));
		}
		for (Integer integer : treeset) {
			System.out.println(integer);
		}

	}catch(
	Exception e)
	{

	}

}}
}


