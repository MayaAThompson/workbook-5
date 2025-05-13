package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = Math.abs(year);
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
    public double getValue() {
        double baseValue = this.originalCost;
        int vehicleAge = LocalDate.now().getYear() - this.year;

        for (int i = 0; i <= vehicleAge; i++) {

            if (i == 0) {
                baseValue *= 1;
            }
            else if (i <= 3) {
                baseValue *= .97;
            }
            else if (i <= 6) {
                baseValue *= .94;
            }
            else if (i <= 10) {
                baseValue *= .92;
            }
            else {
                baseValue = 1000;
            }

        }

        if (this.makeModel.contains("Toyota") || this.makeModel.contains("Honda") || this.odometer <= 100000) {
             return baseValue;
        }
        else {
            return baseValue * .75;
        }
    }
}
