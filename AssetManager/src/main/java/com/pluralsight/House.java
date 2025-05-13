package com.pluralsight;

public class House extends Asset{

    private String address;
    private int condition; //1 - Excellent, 2 - Good, 3 - Fair, 4 - Poor
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double baseValue = this.squareFoot;
        switch (this.condition) {
            case 1 -> baseValue *= 180.0;
            case 2 -> baseValue *= 130.0;
            case 3 -> baseValue *= 90.0;
            case 4 -> baseValue *= 80.0;
            default -> {return baseValue;}
        }
        return baseValue + this.lotSize * .25;
    }
}
