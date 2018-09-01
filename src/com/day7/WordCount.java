package com.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static int countWords(String s) {
		int wordcount = 0;
		File file = new File("C:\\day7\\sampleTest.java");
		try (FileReader filereader = new FileReader(file);
				BufferedReader reader = new BufferedReader(filereader);) {
			
			while ((s = reader.readLine()) != null) {
				//wordcount++;
				 String[] words = s.split(" ");
				 wordcount = wordcount + words.length;
				 break;
	                
			}
		} catch (IOException e) {

			//e.printStackTrace();
		}
		
		return wordcount;

	}
}