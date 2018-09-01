package day7;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.day7.VowelsConsonants;

class VowelsTest {

	@Test
	void test() {
		File file=new File("C:\\day7\\SampleTest.java");
		assertEquals(19,VowelsConsonants.countVowels(file));
	}
}