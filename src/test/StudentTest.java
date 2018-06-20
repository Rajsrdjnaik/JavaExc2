package test;

import static org.junit.jupiter.api.Assertions.*;
import main.Student;

import org.junit.jupiter.api.Test;

class StudentTest {

	int[] c = {86,65,98,77};
	@Test
	public void test() {
		Student obj = new Student();
		double a = obj.funct(c);
		assertEquals(81.0,a);
	}
	
	@Test
	public void test1() {
		Student obj = new Student();
		int a = obj.funct1(c);
		assertEquals(65,a);
	}
	
	@Test
	public void test2() {
		Student obj = new Student();
		int a = obj.funct2(c);
		assertEquals(98,a);
	}

}
