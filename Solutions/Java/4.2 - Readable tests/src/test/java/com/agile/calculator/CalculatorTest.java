package com.agile.calculator;


import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest{



    private static Calculator calculator;

    @BeforeClass
    public static void setup(){
        calculator = new Calculator();
    }

    @Test
    public void subtractTest(){
        // for integers
        assertEquals(2,calculator.subtract("5,3"));
    }


    @Test
    public void subtract2Test(){
        // for negative number
        assertEquals(-8,calculator.subtract("-5,3"));
    }
    @Test
    public void subtract3Test(){
        // for integers plus negatives
        assertEquals(2,calculator.subtract("4,2"));
    }

    @Test
    public void divide(){
        // for integers
        assertEquals(5,calculator.divide("10,2"));
    }

    @Test
    public void divide2(){
        // for integers
        assertEquals(-5,calculator.subtract("10,-2"));
    }

    @Test
    public void multiply(){
        // for integers
        assertEquals(50,calculator.multiply("25,2"));
    }

    @Test
    public void multiply2(){
        // for integers
        assertEquals(600,calculator.multiply("150,4"));
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void dividewithsomeexception(){
        calculator.divide("10,0");
    }
}