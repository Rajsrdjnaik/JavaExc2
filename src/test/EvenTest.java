package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.Even;

public class EvenTest {

	Even obj = new Even();
	
	@Test
	public void test() {
		boolean check = obj.isEven(100);
		assertEquals(true,check);
	}

}