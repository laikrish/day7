package day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.LineNumberReader;

import org.junit.jupiter.api.Test;

class LineCount {

	@Test
	void testLineCount() {
		File file = new File("C:\\day7\\MyCalculator.java");
		LineReader reader=new LineReader(file);
	String s;
	while( (s = reader.readLine()) != null)
		writer.println(s);
		

}
}
