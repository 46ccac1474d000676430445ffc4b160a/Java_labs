package edu.lab7.lab3;

/**
 *
 * @author osmose
 */

public final class N1 {
    
    public static void show() {
        System.out.println("\nSum of first 10 numbers of row = "+N1.first10ofRow());
        System.out.println("Sum of row with precision of 0.000001 = "+N1.rowWithPrecision(0.000001));
    }
    
    private static double f(int n) {
        double sign = (n%2 == 0) ? 1. : -1.;
        return sign*( ((double)(n+1)) / Math.pow(2., n-1) );
    }
    
    public static double first10ofRow() {
        double result = 0.;
        for (int i = 0; i < 10; i++) result += f(i);
        return result;
    }
    
    public static double rowWithPrecision(double precision) {
        double result = 0.;
        double e;
        int N = 0;
        do {
            result += e = f(N++);
        } while (Math.abs(e) > precision);
        return result;
    }
            
}
