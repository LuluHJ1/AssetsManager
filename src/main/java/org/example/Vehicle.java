package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;


public class Vehicle extends Assets{

    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public BigDecimal getValue(){
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;

        BigDecimal value;

        if(age <= 3){

            value = getOriginalCost().subtract(getOriginalCost()
                    .multiply(new BigDecimal("0.03")).multiply(new BigDecimal(age)));
        }
        else if(age <= 6){
            value = getOriginalCost().subtract(getOriginalCost()
                    .multiply(new BigDecimal("0.06")).multiply(new BigDecimal(age)));
        }
        else if(age <= 10){
            value = getOriginalCost().subtract(getOriginalCost()
                    .multiply(new BigDecimal("0.08")).multiply(new BigDecimal(age)));
        }
        else{
            value = new BigDecimal("1000.00");
        }

        String model= makeModel.toLowerCase();
        if(odometer > 100_000 && !makeModel.contains("Honda") && !makeModel.contains("Toyota")){
            value = value.multiply(new BigDecimal("0.75"));
        }
        return value.setScale(2, RoundingMode.HALF_UP);
    }
}
