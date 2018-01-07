package edu.lab7.lab2;

/**
 *
 * @author osmose
 */

public class Lab2 {

    public static void main(String[] args) {
        
        Planet[] planets = new Planet[10];
        
        for (int i = 0; i < 9; i++) planets[i] = new Planet();
        
        planets[9] = new Planet("Mars", 3389.5, 6.4171E23, "Solar system");
        
        int pos = -1;
        for (int i = 0; i < planets.length; i++)
            if ("Mars".equals(planets[i].getName())) {
                pos = i;
                break;
            } 
        
       if (pos < 0) System.out.println("Not found!");
       else System.out.println(planets[pos]);
       
    }
    
}
