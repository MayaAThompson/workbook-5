package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Moped vespa = new Moped();
        Car skyline = new Car();
        SemiTruck mac = new SemiTruck();
        Hovercraft coolerThanYou = new Hovercraft();

        vespa.setFuelCapacity(4);
        vespa.setColor("Red");

        skyline.setTopSpeed(300);
        skyline.setColor("Midnight Purple");

        mac.setCargoCapacity(110);
        mac.setColor("White");

        coolerThanYou.setNumberOfPassengers(4);
        coolerThanYou.setColor("Black");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vespa);
        vehicles.add(skyline);
        vehicles.add(mac);
        vehicles.add(coolerThanYou);

        for (Vehicle vehicle : vehicles) {
            System.out.println("This vehicle is: " + vehicle.getColor());
        }
    }
}
