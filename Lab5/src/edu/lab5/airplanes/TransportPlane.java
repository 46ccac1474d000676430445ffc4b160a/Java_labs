package edu.lab5.airplanes;

/**
 *
 * @author osmose
 */

public class TransportPlane extends Airplane {
    
    TransportPlane() {
        weight = 650000.;
        power = 336000.;
        cargoCapacity = 150000.;
        numOfSeats = 527;
    }

    @Override
    public String getModel() {
        return "Airbus A380-800/A380-800F";
    }

    @Override
    public String getCountry() {
        return "France";
    }

    @Override
    public String getRegion() {
        return "Occitanie";
    }

    @Override
    public String getCity() {
        return "Toulouse";
    }
    
}
