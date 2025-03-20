package Sriza.unitTesting.classActivity1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddTwoNumbers() {
        Calculator cal = new Calculator();
        int actual = cal.add(5, 5);

        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int expected = 5;

        int  actual = calculator.subtract(10, 5);

        assertEquals(expected, actual);
    }
}