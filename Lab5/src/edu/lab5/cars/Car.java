package edu.lab5.cars;

import edu.lab5.vehicle.Vehicle;
import edu.lab5.producer.Producer;

/**
 *
 * @author osmose
 */

public abstract class Car extends Vehicle implements Producer {
    
    protected double cargoCapacity;
    protected int numOfWheels;
    protected int numOfSeats;
    
    Car() {
        cargoCapacity = 0.0;
        numOfWheels = 4;
        numOfSeats = 5;
    }
    
    public double getCargoCapacity() {
        return cargoCapacity;
    }
    
    public int getNumOfWheels() {
        return numOfWheels;
    }
    
    public int getNumOfSeats() {
        return numOfSeats;
    }
    
}
