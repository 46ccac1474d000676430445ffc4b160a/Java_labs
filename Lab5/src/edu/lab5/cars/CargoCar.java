package edu.lab5.cars;

/**
 *
 * @author osmose
 */

public class CargoCar extends Car {
    
    CargoCar() {
        weight = 360000.;
        power = 8500.;
        cargoCapacity = 450000.;
        numOfWheels = 8;
        numOfSeats = 1;
    }

    @Override
    public String getModel() {
        return "БелАЗ-75710";
    }

    @Override
    public String getCountry() {
        return "Республика Беларусь";
    }

    @Override
    public String getRegion() {
        return "Минская область";
    }

    @Override
    public String getCity() {
        return "Жодино";
    }
    
}
