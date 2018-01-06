package edu.lab3;

import java.util.Random;

/**
 *
 * @author osmose
 */

public final class N3 {
    
    public static void show() {
        
        int[] Arr = new int[200];
        Random rand = new Random();
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = rand.nextInt(100);
            System.out.printf("%3d %d\n", i, Arr[i]);
        }
        
        int pos = 0, lsum = sum(Arr, 0);
        for (int i = 1; i < Arr.length-9; i++) {
            
            int tsum = sum(Arr, i);
            if (lsum < tsum) {
                
                lsum = tsum;
                pos = i;
            }
        }
        
        System.out.printf("\n10 elements starts from %d are compose biggest sum = %d\n", pos, lsum);
        
    }
    
    private static int sum(int[] Arr, int p) {
        int s = 0;
        for (int i = 0; i < 10; i++) s += Arr[i+p];
        return s;
    }
    
}
