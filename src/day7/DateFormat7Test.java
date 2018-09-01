package day7;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.day7.DateFormat7;

class DateFormat7Test {

	@Test
	void testDateFormat() throws ParseException {
		
		
			
					 assertEquals("12/12/2010",DateFormat7.DateFormat7("12122010"));
					 assertEquals("12 December, 2010",DateFormat7.DateFormat07("12122010"));
		    
		}

}