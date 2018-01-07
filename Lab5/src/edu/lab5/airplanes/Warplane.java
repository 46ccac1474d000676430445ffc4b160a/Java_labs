package edu.lab5.airplanes;

/**
 *
 * @author osmose
 */

public class Warplane extends Airplane {
    
    Warplane() {
        weight = 29200.;
        power = 31752.;
        cargoCapacity = 18300.;
    }

    @Override
    public String getModel() {
        return "Lockheed/Boeing F-22 Raptor";
    }

    @Override
    public String getCountry() {
        return "USA";
    }

    @Override
    public String getRegion() {
        return "Maryland";
    }

    @Override
    public String getCity() {
        return "Bethesda";
    }
    
}
