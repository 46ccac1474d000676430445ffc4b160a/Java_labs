package edu.lab5.cars;

/**
 *
 * @author osmose
 */

public class SportCar extends Car {
    
    SportCar() {
        weight = 1295;
        power = 1341;
        numOfSeats = 2;
    }

    @Override
    public String getCountry() {
        return "Sweden";
    }

    @Override
    public String getRegion() {
       return "Skåne";
    }

    @Override
    public String getCity() {
        return "Margretetorp";
    }

    @Override
    public String getModel() {
        return "Koenigsegg Agera RS";
    }
    
}
