package org.example;

import java.math.BigDecimal;

public class Vehicle extends Assets{
    public Vehicle(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }
}
