package rasheeda.javaSyntax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private Task taskTest;

    @BeforeEach
    void setUp() {

        taskTest = new Task();
    }

    @Test
    void addTwuNumbers() {


        int result = taskTest.addTwuNumbers(5, 6);

        assertEquals(11, result);
    }


    @Test
    void addNegativeNumbers(){
        int result = taskTest.addTwuNumbers(-5, -2);

        assertEquals(-7, result);
    }



}