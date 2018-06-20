package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ValidateFourPower;

class ValidateFourPowerTest {

	@Test
	public void test() {
		ValidateFourPower obj = new ValidateFourPower();
		boolean x = obj.func(128);
		assertEquals(false, x);
	}
	
	@Test
	public void test1() {
		ValidateFourPower obj = new ValidateFourPower();
		boolean x = obj.func(64);
		assertEquals(true, x);
	}

}