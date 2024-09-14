package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {
    Trip sedanTrip = new Trip(VehicleType.SEDAN, 20, 10, 2);
    Trip motorBikeTrip = new Trip(VehicleType.MOTOR_BIKE, 10,15,1);
    Trip sevenSeaterTrip = new Trip(VehicleType.SEVEN_SEATER, 30,30,7);



    @Test
    public void fairSedanTest(){
        int result = sedanTrip.perHeadFare();

        int expected = 335;

        assertEquals(expected, result);
    }

    @Test
    public void fairMotorBikeTest(){
        int result = motorBikeTrip.perHeadFare();

        int expected = 200;

        assertEquals(expected, result);
    }

    @Test
    public void fairSevenSeaterTest(){
        int result = sevenSeaterTrip.perHeadFare();

        int expected = 125;

        assertEquals(expected, result);
    }

    @Test
    public void canTakeSedanTripTest() {
        boolean result = sedanTrip.canTakeTrip();

        assertTrue(result);
    }

    @Test
    public void canTakeMotorBikeTripTest(){
        boolean result = motorBikeTrip.canTakeTrip();

        assertTrue(result);
    }

    @Test
    public void canTakeSevenSeaterTripTest(){
        boolean result = sevenSeaterTrip.canTakeTrip();

        assertTrue(result);
    }


}