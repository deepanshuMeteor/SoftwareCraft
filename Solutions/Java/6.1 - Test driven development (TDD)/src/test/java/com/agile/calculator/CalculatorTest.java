package com.agile.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.agile.calculator.Calculator;

public class CalculatorTest {

	private static Calculator calculator;

	@BeforeClass
	public static void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void subtractTest() {
		int expected = 2;
		int actual = calculator.subtract("5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtract2Test() {
		int expected = -8;
		int actual = calculator.subtract("-5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtract3Test() {
		int expected = 2;
		int actual = calculator.subtract("4,2");
		assertEquals(expected, actual);
	}

	@Test
	public void divide() {
		int expected = 5;
		int actual = calculator.divide("10,2");
		assertEquals(expected, actual);
	}
	@Test
	public void divide2() {
		int expected = -5;
		int actual = calculator.divide("10,-2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiply() {
		int expected = 50;
		int actual = calculator.multiply("25,2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiply2() {
		int expected = 600;
		int actual = calculator.multiply("150,4");
		assertEquals(expected, actual);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void dividewithsomeexception() {
		calculator.divide("10,0");
	}
	
	// Add method tests below
	@Test
	public void addEmptyString() {
		int expected = 0;
		int actual = calculator.add("");
		assertEquals(expected, actual);
	}
	
	@Test
	public void addSingleNumber() {
		int expected = 5;
		int actual = calculator.add("5");
		assertEquals(expected, actual);
	}
	
	@Test
	public void addTwoNumbersWithComma() {
		int expected = 10;
		int actual = calculator.add("5,5");
		assertEquals(expected, actual);
	}
	
	@Test
	public void addTwoNumbersWithNewLine() {
		int expected = 10;
		int actual = calculator.add("5\n5");
		assertEquals(expected, actual);
	}
	
	@Test
	public void addThreeNumbersWithComma() {
		int expected = 15;
		int actual = calculator.add("5,5,5");
		assertEquals(expected, actual);
	}
	
	@Test
	public void addThreeNumbersWithNewLine() {
		int expected = 15;
		int actual = calculator.add("5\n5\n5");
		assertEquals(expected, actual);
	}
	
	@Test
	public void addThreeNumbersCombo() {
		int expected = 15;
		int actual = calculator.add("5\n5,5");
		assertEquals(expected, actual);
	}
	
	@Test(expected = RuntimeException.class)
	public void addNegativeNumberException() {
		calculator.add("5,-5");
	}
}
