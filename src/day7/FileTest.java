package day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileTest {

	@Test
	void testExistenceOfFile() {
		File file = new File("C:\\day7\\MyCalculator.java");
		assertEquals(true, file.exists());
		assertEquals(true, file.isFile());
	}

}