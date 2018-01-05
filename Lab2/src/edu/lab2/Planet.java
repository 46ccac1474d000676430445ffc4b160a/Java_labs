package edu.lab2;

/**
 *
 * @author osmose
 * 
 * 9. Планета (название, радиус, масса, в какой системе находится)
 * 
 */

public class Planet {
    
    private String name;
    private double radius;
    private double mass;
    private int massPower;
    private String system;
    
    Planet() {
        this.name = "Earth";
        this.radius = 6371;
        this.mass = 5.9726;
        this.massPower = 24;
        this.system = "Solar system";        
    }
    
    Planet(String name, double radius, double mass, int massPower, String system) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.massPower = massPower;
        this.system = system;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public int getMassPower() {
        return massPower;
    }
    
    public double getCountedMass() {
        double mult = 1.0;
        for (int i = 0; i < massPower; i++) mult *= 10;
        return mass*mult;
    }
    
    public void setMass(double mass, int massPower) {
        this.mass = mass;
        this.massPower = massPower;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }
    
    @Override
    public String toString() {
        return getClass().getName() +   " Name: " + name +
                                        ", radius: " + radius +
                                        ", mass: " + mass + "x(10^" + massPower +
                                        "), system: " + system;
    }
    
}
