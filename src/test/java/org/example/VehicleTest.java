package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void getVehicleValue() {
        //Arrange
        Vehicle vehicle1 = new Vehicle("Mercedes", "5-13-2026",
                new BigDecimal(10_000), "Mercedes Benz", 2026, 10_000);

        Vehicle vehicle2 = new Vehicle("Ford", "5-12-2026",
                new BigDecimal(10_000), "Ford Raptor", 2021, 10_000);

        Vehicle vehicle3 = new Vehicle("Acura", "5-11-2026",
                new BigDecimal(10_000), "Acura TlX", 2017, 10_000);

        Vehicle vehicle4 = new Vehicle("Lexus", "4-13-2026",
                new BigDecimal(1000), "Lexus IS250", 2005, 101_000);

        Vehicle vehicle5 = new Vehicle("Honda ", "5-10-2026",
                new BigDecimal(10_000), "Honda Civic", 2020, 101_000);

        //Act
        BigDecimal testValue1 = vehicle1.getValue();
        BigDecimal testValue2 = vehicle2.getValue();
        BigDecimal testValue3 = vehicle3.getValue();
        BigDecimal testValue4 = vehicle4.getValue();
        BigDecimal testValue5 = vehicle5.getValue();
        //Assert
        assertEquals(new BigDecimal("10000.00"), testValue1);
        assertEquals(new BigDecimal("7000.00"), testValue2);
        assertEquals(new BigDecimal("2800.00"), testValue3);
        assertEquals(new BigDecimal("750.00"), testValue4);
        assertEquals(new BigDecimal("6400.00"), testValue5);

    }
}