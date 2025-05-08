package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_whenNotOccupiedAndNotDirty_setBothTrue() {

        //Arrange
        Room room = new Room(1, 200);
        room.checkIn();

        // Act
       room.checkIn();

        // Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());

    }


    @Test //Idk how to do this one... its too simple to test
    public void checkOut_RoomIsOccupied_RToomIsNotOccupied() {

        //Arrange
        boolean isOccupied = false;
    }

    @Test
    public void cleanroom() {

        // Arrange



        // Act

        // Assert



    }

}