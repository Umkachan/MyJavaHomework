package com.petrov.lesson6.vehicles;

import com.petrov.lesson6.details.ElectricalEngine;
import com.petrov.lesson6.interfaces.Car;
import com.petrov.lesson6.interfaces.Driver;
import com.petrov.lesson6.interfaces.Engine;

public class ElectricTruck implements Car {

    private String carMake;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public ElectricTruck(Driver inputDriver, Engine inputEngine, double inputWeight, String inputCarMake, String inputCarClass)
    {
           driver = inputDriver;
           engine = inputEngine;
           carMake = inputCarMake;
           carClass = inputCarClass;
           weight = inputWeight;
    }

    private String getTechnicalDetails()
    {
       return "Car make: " + carMake + " Car class: " + carClass + " Weight: " + weight;
    }


    public void getTotalInfo()
    {
        String driverInfo = driver.getFullDriverInfo();
        String engineInfo = engine.getEngineInfo();
        String technicalInfo = getTechnicalDetails();

        System.out.println(driverInfo);
        System.out.println(technicalInfo);
        System.out.println(engineInfo);
    }

    public void start() {

        System.out.println("Go");
    }

    public void stop() {

        System.out.println("stop");
    }

    public void turnRight() {

        System.out.println("Turn right");
    }

    public void turnLeft() {

        System.out.println("Turn left");
    }
}
