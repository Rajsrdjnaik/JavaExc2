package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.MemberVariable;

class MemberTest {
	
	@Test
	public void test() {
		MemberVariable obj = new MemberVariable();
		String x = obj.func("Rajat", 30, 2500.3);
		int y = obj.func1("Rajat", 30, 2500.3);
		double z = obj.func2("Rajat", 30, 2500.3);
		assertEquals("Rajat",x);
		assertEquals(30,y);
		assertEquals(2500.3,z);
	}

}
