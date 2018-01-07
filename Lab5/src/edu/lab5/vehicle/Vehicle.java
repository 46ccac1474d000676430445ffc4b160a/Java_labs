package edu.lab5.vehicle;

/**
 *
 * @author osmose
 */

public abstract class Vehicle {
    
    protected double weight;
    protected double power;
    protected double speed;
    protected double direction;
    protected boolean vehicleStarted;
    
    public Vehicle() {
        weight = power = speed = direction = 0.;
        vehicleStarted = false;
    }
    
    public double getWeight() {
        return weight;
    }

    public double getPower() {
        return power;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public boolean isWorking() {
        return vehicleStarted;
    }
    
    public void start() {
        vehicleStarted = true;
    }
    
    public void stop() {
        vehicleStarted = false;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }
    
    public void accelerate(double acceleration) {
        speed += acceleration;
    }
    
    public abstract String getModel();
    
}
