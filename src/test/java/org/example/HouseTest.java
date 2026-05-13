package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    public void getHouseValue(){
        //Arrange
        //Excellent Condition, 500 sq. ft, 1000 lot size
        House house1 = new House("My mansion", "12-01-2002", new BigDecimal(10000),
                "123 Street",1,500, 1000);

        House house2 = new House("Main house", "5-13-2026", new BigDecimal(10000),
                "234 Street",2,500,1000);

        House house3 = new House("Beach House","5-12-2026", new BigDecimal(10000),
                "345 Street", 3,500, 1000);

        House house4 = new House("Mountain house", "5-11-2026",new BigDecimal(10000),
                "456 Street", 4, 500, 1000);
        //Act
        //Run get value
        BigDecimal testValue1 = house1.getValue();
        BigDecimal testValue2 = house2.getValue();
        BigDecimal testValue3 = house3.getValue();
        BigDecimal testValue4 = house4.getValue();

        //Assert
        //I assert the result will be 90250
        assertEquals(new BigDecimal("90250.00"), testValue1);
        assertEquals(new BigDecimal("65250.00"), testValue2);
        assertEquals(new BigDecimal("45250.00"), testValue3);
        assertEquals(new BigDecimal("40250.00"), testValue4);

    }
}