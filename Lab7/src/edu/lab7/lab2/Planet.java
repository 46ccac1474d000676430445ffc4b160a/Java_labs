package edu.lab7.lab2;

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
    private String system;
    
    Planet() {
        this.name = "Earth";
        this.radius = 6371;
        this.mass = 5.9726E24;
        this.system = "Solar system";        
    }
    
    Planet(String name, double radius, double mass, String system) {
        if (name == null) throw new NullPointerException();
        this.name = name;
        if (radius <= 0.) throw new RuntimeException("Radius can not be less then zero");
        this.radius = radius;
        if (mass <= 0.) throw new RuntimeException("Mass can not be less then zero");
        this.mass = mass;
        if (system == null) throw new NullPointerException();
        this.system = system;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new NullPointerException();
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0.) throw new RuntimeException("Radius can not be less then zero");
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }
    
    public void setMass(double mass) {
        if (mass <= 0.) throw new RuntimeException("Mass can not be less then zero");
        this.mass = mass;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        if (system == null) throw new NullPointerException();
        this.system = system;
    }
    
    @Override
    public String toString() {
        return getClass().getName() +   " name: " + name +
                                        ", radius: " + radius +
                                        ", mass: " + getMass() +
                                        ", system: " + system;
    }
    
}
