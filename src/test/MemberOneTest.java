package test;
import static org.junit.jupiter.api.Assertions.*;
import main.*;

import org.junit.jupiter.api.Test;

class MemberOneTest {

	MemberOne m = new MemberOne();
	MemberTwo m2 = new MemberTwo();
	MemberOne mx= m2.createInstance("Rajat",20,2500.3);

@Test
public void test() {
	
	assertEquals("Rajat",mx.getName());
	assertEquals(20,mx.getAge());
	assertEquals(2500.3,mx.getSalary());
}
}

