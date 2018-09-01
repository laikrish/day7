package com.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.Reader;

public class LineCount {

	public static int countLines(String s) {
		int count = 0;
		File file = new File("C:\\day7\\MyCalculator.java");
		try (FileReader filereader = new FileReader(file); BufferedReader reader = new BufferedReader(filereader);) {

			while ((s = reader.readLine()) != null) {
				count++;

			}
		} catch (IOException e) {

			//e.printStackTrace();
		}
		return count;

	}
}