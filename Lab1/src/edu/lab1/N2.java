package edu.lab1;

/**
 *
 * @author osmose
 */

public class N2 {
    
    public static void main(String[] args) {
        
        double k1, k2;
        
        try {
            
            k1 = Double.valueOf(args[0]);
            k2 = Double.valueOf(args[1]);
            
            System.out.printf("\nLegs of right triangle are %.3f, %.3f\nHypotenuse equals %.3f\nAngles are %.3fdeg %.3fdeg 90deg\nSquare equals %.3f\nPerimeter equals %.3f\n\n",
                                    k1, k2,
                                    RTriangle.hypotenuse(k1, k2),
                                    RTriangle.biggestAngle(k1, k2),
                                    RTriangle.smallestAngle(k1, k2),
                                    RTriangle.square(k1, k2),
                                    RTriangle.perimeter(k1, k2)
                             );
            
        } catch (NumberFormatException e) {
            System.out.println("Number is incorrect!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Parameter is missing!!!");
        }
        
    }
    
}
