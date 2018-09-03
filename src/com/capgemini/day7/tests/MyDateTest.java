package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.MyDate;

class MyDateTest {

	@Test
	void test() {
		  MyDate date1=new MyDate(LocalDate.of(2017, 05, 16));
          MyDate date2=new MyDate(LocalDate.of(2012, 07, 13));
          MyDate date3=new MyDate(LocalDate.of(2013, 03, 1));
          MyDate date4=new MyDate(LocalDate.of(2014, 06, 16));
          MyDate date5=new MyDate(LocalDate.of(2011, 05, 16));
          
          ArrayList<MyDate> al=new ArrayList<>();
          al.add(date1);
          al.add(date2);
          al.add(date3);
          al.add(date4);
          al.add(date5);
          
          ArrayList<MyDate> result=new ArrayList<>();
          
          try(FileOutputStream fileOutput=new FileOutputStream("C:\\Pallavi\\Sample.txt");
        		 ObjectOutputStream objectOutput=new ObjectOutputStream(fileOutput))
        		  {
        	  objectOutput.writeObject(al);
        	  
          }
          catch(IOException e)
          {
        	  e.printStackTrace();
          }
          
          try(FileInputStream fileInput=new FileInputStream("C:\\Pallavi\\Sample.txt");
         		 ObjectInputStream objectInput=new ObjectInputStream(fileInput))
         		  {
         	   result=(ArrayList<MyDate>)objectInput.readObject();
           }
           catch(IOException e)
           {
         	  e.printStackTrace();
           } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
         System.out.println(result);
          
          
         
	}
	}

