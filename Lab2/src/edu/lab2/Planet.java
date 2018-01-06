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
    private String system;
    
    Planet() {
        this.name = "Earth";
        this.radius = 6371;
        this.mass = 5.9726E24;
        this.system = "Solar system";        
    }
    
    Planet(String name, double radius, double mass, String system) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
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
    
    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }
    
    @Override
    public String toString() {
        return getClass().getName() +   " name: " + name +
                                        ", radius: " + radius +
                                        ", mass: " + getMass() +
                                        ", system: " + system;
    }
    
    public boolean compare(Object obj) {
        Planet p = (Planet)obj;
        return (name.equals(p.getName()) && radius == p.getRadius() && mass == p.getMass() && system.equals(p.getSystem()));
    }
    
}
