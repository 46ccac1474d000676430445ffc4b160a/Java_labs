package edu.lab7.lab3;

import java.util.Scanner;

/**
 *
 * @author osmose
 */

public final class N2 {
    
    private static final double a = 3.;
    private static final double b = 1.732;
    
    public static void show() {
        double x, y;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Now enter X: ");
        x = scan.nextDouble();
        System.out.print("Now enter Y: ");
        y = scan.nextDouble();
        
        System.out.printf("t1(%f, %f) = %f\n", x, y, t1(x, y));
        System.out.printf("t2(%f) = %f\n", x, t2(x));
    }
    
    public static double t1(double x, double y) {
        if (x <= 0. || y <= 0.) throw new RuntimeException("Not valid value");
        return (1./(b*b)) * ( Math.log(y/x) + (a*x)/y );
    }
    
    public static double t2(double x) {
        if (x <= 0.) throw new RuntimeException("Not valid value");
        return -(x/a)*Math.tan((a*x)/2.) + (2./(a*a))*Math.log( Math.sin((a*x)/2.) );
    }
    
}
