package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        House house1 = new House("My regular home", "05-19-2018", 150000, "123 Fake Way", 3, 1800, 600);
        House house2 = new House("Vacation Home", "01-28-2023", 225000, "456 Real St.", 2, 1450, 800);
        Vehicle car1 = new Vehicle("Daily driver", "12-23-2020", 5000, "Toyota Camry", 2007, 215000);
        Vehicle car2 = new Vehicle("Track car", "06-06-2022", 20000, "Infiniti G37 Coupe", 2018, 65000);

        assets.add(house1);
        assets.add(house2);
        assets.add(car1);
        assets.add(car2);

        for (Asset asset : assets) {
            if (asset instanceof House) {
                System.out.println("\nAddress: " + ((House) asset).getAddress());
            }
            if (asset instanceof Vehicle) {
                System.out.println("\nVehicle: " + ((Vehicle) asset).getYear() + " " +  ((Vehicle) asset).getMakeModel());
            }
            System.out.println("Description: " + asset.getDescription() +
                    "\nDate acquired: " + asset.getDateAcquired() +
                    "\nOriginal cost: " + asset.getOriginalCost() +
                    "\nCurrent value: " + asset.getValue());

        }

    }

}
