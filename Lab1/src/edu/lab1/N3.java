package edu.lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author osmose
 */

public class N3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        try {
            
            System.out.print("\nEnter number: ");
            switch (scan.nextInt()) {
                case 1: System.out.println("Sunday");
                    break;
                    
                case 2: System.out.println("Monday");
                    break;
                    
                case 3: System.out.println("Tuesday");
                    break;
                    
                case 4: System.out.println("Wednesday");
                    break;
                    
                case 5: System.out.println("Thursday");
                    break;
                    
                case 6: System.out.println("Friday");
                    break;
                    
                case 7: System.out.println("Saturday");
                    break;
                    
                default: System.out.println("Number out of range!\n");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Not a number!!!\n");
        }
        
    }
}
