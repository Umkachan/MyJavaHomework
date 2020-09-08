package com.petrov.lesson6.garage;

import com.petrov.lesson6.details.ElectricalEngine;
import com.petrov.lesson6.interfaces.Car;
import com.petrov.lesson6.interfaces.Engine;
import com.petrov.lesson6.professions.TruckDriver;
import com.petrov.lesson6.vehicles.ElectricTruck;
import com.petrov.lesson6.interfaces.Driver;

public class MyGarage {

    public static void main(String[] args)
    {
        Engine engine = new ElectricalEngine(25, "My own");
        Driver driver = new TruckDriver("Roman", "Romanov", "Romanovich", 100);
        Car car = new ElectricTruck(driver, engine, 3000, "Home", "Bug");

        car.getTotalInfo();
    }
}
