package com.pluralsight;

public class Reservation {
        String roomType;
        int nights;
        boolean weekend;

        public Reservation(String type, int nights, boolean weekend) {
            this.roomType = type;
            this.nights = nights;
            this.weekend = weekend;
        }

        // Figure out the total price
        public double getReservationTotal() {
            double pricePerNight = roomType.equalsIgnoreCase("king") ? 139.00 : 124.00;
            if (weekend) {
                pricePerNight = pricePerNight * 1.10; // Add 10% if it's weekend
            }
            return pricePerNight * nights;
        }

    }

