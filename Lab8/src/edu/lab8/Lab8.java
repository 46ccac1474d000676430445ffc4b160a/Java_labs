package edu.lab8;

/**
 *
 * @author osmose
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab8 {

    public static void main(String[] args) {
        
        int avaibleNumOfWords = 2;
        
        String text = new String();
        
        BufferedReader buf = null;
        
        try {
            
            buf = new BufferedReader(new FileReader("file.txt"));
            
            String t;
            while ( (t = buf.readLine()) != null ) printNwordSent(t, avaibleNumOfWords);
            
        } catch (IOException ex) {
            try {
                if (buf != null) buf.close();
            } catch (IOException ex2) {}
            ex.printStackTrace(System.out);
        }
        
    }
    
    private static boolean checkStr(String s, int c) {
        
        int counter = 0;
        int N = s.length();
        for (int i = 0;;) {
            
            while ( i < N && !Character.isAlphabetic(s.charAt(i)) ) i++;
            if (i >= N) break;
            while ( i < N && Character.isAlphabetic(s.charAt(i)) ) i++;
            counter++;
            
        }
        
        return (counter == c);
        
    }
    
    private static void printNwordSent(String text, int N) {
        int pos = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ( c == '.' || i == (text.length()-1) ) {
                String substr = text.substring(pos, i+1);
                pos = i+1;
                if (checkStr(substr, N)) System.out.println(substr); 
            }
        }
    }
    
}
