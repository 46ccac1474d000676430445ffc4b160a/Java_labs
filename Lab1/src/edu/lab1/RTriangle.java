package edu.lab1;

/**
 *
 * @author osmose
 */

public final class RTriangle {
    
    public static double hypotenuse(double k1, double k2) {
        return Math.sqrt(k1*k1 + k2*k2);
    }
    
    public static double biggestAngle(double k1, double k2) {
        double t1 = (Math.atan(k1/k2)*180) / Math.PI;
        double t2 = (Math.atan(k2/k1)*180) / Math.PI;
        return (t1 > t2) ? t1 : t2;
    }
    
    public static double smallestAngle(double k1, double k2) {
        double t1 = (Math.atan(k1/k2)*180) / Math.PI;
        double t2 = (Math.atan(k2/k1)*180) / Math.PI;
        return (t1 > t2) ? t2 : t1;
    }
   
    public static double square(double k1, double k2) {
        return (k1 * k2) / 2;
    }
    
    public static double perimeter(double k1, double k2) {
        return k1 + k2 + hypotenuse(k1, k2);
    }
    
}
