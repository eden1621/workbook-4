package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
//create derived methods
    //method to check if the room is available
    //based on if it is clean and occupied

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }


    //constructor to instantiate a room

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }
    public class room {
        boolean isOccupied;
        boolean isDirty;

        public room() {
            isOccupied = false;
            isDirty = false;
        }

        // Someone checks into the room
        public void checkIn() {
            if (!isOccupied && !isDirty) {
                isOccupied = true;
                isDirty = true;
                System.out.println("Guest checked in.");
            } else {
                System.out.println("Room is not ready!");
            }
        }

        // Guest leaves the room. can only check in if room is not occupied and not dirty
        public void checkOut() {
            if (isOccupied) {
                isOccupied = false;
                System.out.println("Guest checked out. Room is dirty now.");
            } else {
                System.out.println("Room is already empty.");
            }
        }

        // Clean the room
        public void cleanRoom() {
            if (!isOccupied && isDirty) {
                isDirty = false; // room becomes dirty when occupied
                System.out.println("Room has been cleaned.");
            } else {
                System.out.println("Room does not need cleaning.");
            }
        }

        public boolean isAvailable() {
            return !isOccupied && !isDirty;
        }
    }


}
