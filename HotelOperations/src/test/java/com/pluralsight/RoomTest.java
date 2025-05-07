package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    private Room room;

    @BeforeEach
    public void setup() {
        room = new Room(); // assumes a default constructor
    }

    @Test
    public void testCheckIn() {
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void testCheckInAlreadyOccupied() {
        room.checkIn();
      