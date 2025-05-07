package com.pluralsight;

public class App {
    public static void main(String[] args) {

        // Make a new room with 2 beds, $150 price, not occupied, and clean
        Room room1 = new Room(2, 150.00, false, false);
        Room room2 = new Room(1, 100.00, true, true);

        //room one should be available because it is not dirty and is not occupied
        public static void main(String[] args) {
            // Make a new room with 2 beds, $150 price, not occupied, and clean
            Room room2 = new Room(2, 150.00, false, false);
            System.out.println("Is the room ready? " + room1.equals());

            // Make a new reservation for a king room, 3 nights, on a weekend
            Reservation reservation1 = new Reservation("king" 3 , true);
            System.out.println("How much does the stay cost? $" + reservation1.getReservationTotal());

            // Make a new employee who worked 45 hours
            Employee emp1 = new Employee("E001", "Eden Mengistu", "Front Desk", 20.0, 45.0);
            System.out.println(emp1.getName() + " earns: $" + emp1.getTotalPay());
        }


    }
}