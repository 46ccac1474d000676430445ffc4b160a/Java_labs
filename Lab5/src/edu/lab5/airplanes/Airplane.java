package edu.lab5.airplanes;

import edu.lab5.vehicle.Vehicle;
import edu.lab5.producer.Producer;

/**
 *
 * @author osmose
 */

public abstract class Airplane extends Vehicle implements Producer {
    
    protected double cargoCapacity;
    protected int numOfSeats;
    protected double verticalDirection;
    
    Airplane() {
        verticalDirection = cargoCapacity = 0.0;
        numOfSeats = 1;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setVerticalDirection(double verticalDirection) {
        this.verticalDirection = verticalDirection;
    }

    public double getVerticalDirection() {
        return verticalDirection;
    }

    
}
