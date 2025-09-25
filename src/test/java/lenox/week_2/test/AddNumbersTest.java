package lenox.week_2.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddNumbersTest {

    @Test
    void addTwoNumbers() {
        AddNumbers calculateTwoNumbers = new AddNumbers();

        int result = calculateTwoNumbers.addTwoNumbers(5, 10);

        assertEquals(15, result);




    }
}