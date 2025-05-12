package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Moped vespa = new Moped("Red", 2, 0, 4, 30, false);
        Car skyline = new Car("Midnight Purple", 4, 8, 64, 300, 4);
        SemiTruck mac = new SemiTruck("White", 2, 110, 150, 150, true);
        Hovercraft coolerThanYou = new Hovercraft("Black", 1, 2, 45, 100, true);

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
