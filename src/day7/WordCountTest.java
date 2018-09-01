package day7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import org.junit.jupiter.api.Test;

import com.day7.WordCount;

class WordCountTest {

	@Test
	void testWordCount() throws IOException {
		assertEquals(4,WordCount.countWords("C:\\day7\\sampleTest.java"));
}
}
