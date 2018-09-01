package day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.day7.Grep;

class GrepTest {

	@Test
	void testGrep() {
		File file=new File("C:\\day7\\SampleTest.java");
		assertEquals(true,Grep.stringSearch(file,"**"));

	}

}