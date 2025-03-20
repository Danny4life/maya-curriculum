package Sriza.unitTesting.classActivity3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlightBooking {
    private final Map<String, Set<String>> flightPassengers; // Stores flight numbers & their passengers
    private final Map<String, Integer> flightCapacity; // Stores flight numbers & max seats

    public FlightBooking() {
        this.flightPassengers = new HashMap<>();
        this.flightCapacity = new HashMap<>();
    }

    // Add a flight with a specific seat capacity
    public void addFlight(String flightNumber, int capacity) {
        flightPassengers.put(flightNumber, new HashSet<>());
        flightCapacity.put(flightNumber, capacity);
    }

    // Book a ticket for a passenger
    public boolean bookTicket(String passengerName, String flightNumber) {
        if (!flightPassengers.containsKey(flightNumber)) {
            throw new IllegalArgumentException("Flight does not exist");
        }

        Set<String> passengers = flightPassengers.get(flightNumber);
        int maxSeats = flightCapacity.get(flightNumber);

        if (passengers.size() >= maxSeats) {
            return false; // Flight is full
        }

        return passengers.add(passengerName); // Returns true if booking is successful
    }

    // Cancel a ticket for a passenger
    public boolean cancelTicket(String passengerName, String flightNumber) {
        if (!flightPassengers.containsKey(flightNumber)) {
            throw new IllegalArgumentException("Flight does not exist");
        }

        return flightPassengers.get(flightNumber).remove(passengerName);
    }

    // Check if seats are available for a flight
    public boolean isSeatAvailable(String flightNumber) {
        if (!flightPassengers.containsKey(flightNumber)) {
            throw new IllegalArgumentException("Flight does not exist");
        }

        return flightPassengers.get(flightNumber).size() < flightCapacity.get(flightNumber);
    }
}
