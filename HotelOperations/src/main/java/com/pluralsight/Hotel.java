package com.pluralsight;

public class Hotel {// These are the things our hotel needs to remember
    private String name;
    private int numberOfSuites;       // Total King Suites
    private int numberOfRooms;        // Total Basic Double Rooms
    private int bookedSuites;         // Booked King Suites
    private int bookedBasicRooms;     // Booked Basic Rooms

    // First constructor: just the name and total rooms, nothing is booked yet
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // Second constructor: you say how many rooms and how many are already booked
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // This method is used to try and book rooms
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            // Trying to book King Suites
            if (bookedSuites + numberOfRooms <= numberOfSuites) {
                bookedSuites += numberOfRooms;
                return true; // Booking worked
            } else {
                return false; // Not enough suites
            }
        } else {
            // Trying to book Basic Rooms
            if (bookedBasicRooms + numberOfRooms <= numberOfRooms) {
                bookedBasicRooms += numberOfRooms;
                return true; // Booking worked
            } else {
                return false; // Not enough rooms
            }
        }
    }

    // Get how many suites are still free
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

}
