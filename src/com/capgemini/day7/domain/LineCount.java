package com.capgemini.day7.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {

	public static  int countLines(String string) {
		
		File file=new File("C:\\Pallavi\\Sample.txt");
		int c=0;
		try (FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader)
				) {		
			
			String s;
			while( (s = reader.readLine()) != null)
			{
				c++;
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return c;
	
	}
	

}
