package day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.day7.BinaryInteger;

class BinaryIntegerTest {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\day7\\MyCalculator.java");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}

}
