package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        House myHouse = new House("House", "5-12-2026", new BigDecimal(10_000),
                "123 street", 4,2000,10_000);
        House beachHouse = new House("Beach House","5-13-2026", new BigDecimal(20_000),
                "456 Street", 4, 20_000, 20_000);

        Vehicle myVehicle = new Vehicle("Car","5-10-2026", new BigDecimal(5_000));
        Vehicle car2 = new Vehicle("2nd Car","5-9-2026",new BigDecimal(3_000));
    }
}