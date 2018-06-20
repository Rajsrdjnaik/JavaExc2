package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.*;

class StringReverseTest {

	@Test
	
	public 	void test() {
		StringReverse obj = new StringReverse();
		String x = obj.func("1331");
		assertEquals("1331",x);
		}

	@Test
	
	public 	void test1() {
		StringReverse obj = new StringReverse();
		boolean x = obj.func1("1331");
		assertEquals(true,x);
		}
	
}
