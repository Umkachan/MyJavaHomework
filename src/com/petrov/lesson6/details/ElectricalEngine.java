package com.petrov.lesson6.details;

import com.petrov.lesson6.interfaces.Engine;

public class ElectricalEngine implements Engine {

    private int power;
    private String manufacturer;

    public ElectricalEngine(int inputPower, String inputManufacturer)
    {
        power = inputPower;
        manufacturer = inputManufacturer;
    }

    public String getEngineInfo()
    {
       String engineInfo = "Power :" + power + " Manufacturer: " + manufacturer;
       return engineInfo;
    }
}
