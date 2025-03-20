package Sriza.unitTesting.classActivity3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightBookingTest {

    /**
     * Understanding @BeforeEach in JUnit
     * In JUnit 5, the @BeforeEach annotation is used to define
     * a method that runs before each test case in the test class.
     * This ensures that test cases start with a fresh instance
     * of necessary objects, preventing unintended dependencies between tests.
     *
     * When Should You Use @BeforeEach?
     * ✔ When you need to initialize objects before every test (e.g., creating a new FlightBooking object).
     * ✔ When your test methods share common setup logic (e.g., setting up a database connection, clearing a list).
     * ✔ When you want to ensure each test runs in isolation, avoiding shared state between tests.
     *
     *
     * What Happens Without @BeforeEach?
     * If we don't use @BeforeEach, the same object might be shared between tests, leading to unexpected failures.
     * For example, without @BeforeEach, a test modifying an object may affect another test running later.
     */

    private FlightBooking flightBooking;

    @BeforeEach
    void setUp() {
        flightBooking = new FlightBooking();
        flightBooking.addFlight("FL123", 2); // Flight with 2 seats
    }

    @Test
    void testBookTicketSuccessfully() {
        assertTrue(flightBooking.bookTicket("Alice", "FL123"), "Alice should be able to book a ticket");
        assertTrue(flightBooking.bookTicket("Bob", "FL123"), "Bob should be able to book a ticket");
    }

    @Test
    void testBookTicketFailsWhenFull() {
        flightBooking.bookTicket("Alice", "FL123");
        flightBooking.bookTicket("Bob", "FL123");
        assertFalse(flightBooking.bookTicket("Charlie", "FL123"), "Charlie should NOT be able to book (flight is full)");
    }

    @Test
    void testCancelTicketSuccessfully() {
        flightBooking.bookTicket("Alice", "FL123");
        assertTrue(flightBooking.cancelTicket("Alice", "FL123"), "Alice's ticket should be canceled");
        assertTrue(flightBooking.isSeatAvailable("FL123"), "Seats should be available after cancellation");
    }

    @Test
    void testCancelNonExistentTicket() {
        assertFalse(flightBooking.cancelTicket("David", "FL123"), "Cancel should fail for non-existent booking");
    }

    @Test
    void testIsSeatAvailable() {
        assertTrue(flightBooking.isSeatAvailable("FL123"), "Seats should be available initially");
        flightBooking.bookTicket("Alice", "FL123");
        flightBooking.bookTicket("Bob", "FL123");
        assertFalse(flightBooking.isSeatAvailable("FL123"), "Seats should NOT be available after full booking");
    }

    @Test
    void testBookTicketForNonExistentFlight() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> flightBooking.bookTicket("Eve", "FL999"));
        assertEquals("Flight does not exist", exception.getMessage());
    }

    @Test
    void testCancelTicketForNonExistentFlight() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> flightBooking.cancelTicket("Eve", "FL999"));
        assertEquals("Flight does not exist", exception.getMessage());
    }

    @Test
    void testIsSeatAvailableForNonExistentFlight() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> flightBooking.isSeatAvailable("FL999"));
        assertEquals("Flight does not exist", exception.getMessage());
    }
}