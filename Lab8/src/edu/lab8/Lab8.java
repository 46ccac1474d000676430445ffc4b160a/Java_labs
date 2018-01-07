package edu.lab8;

/**
 *
 * @author osmose
 */

import java.io.*;

public class Lab8 {

    public static void main(String[] args) {
        
        int avaibleNumOfWords = 2;
        
        String text = new String();
        
        FileReader reader;
        
        try {
            reader = new FileReader("file.txt");
            
            int c;
            while((c=reader.read())!=-1){
                 
                text += ((char)c);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        int pos = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ( c == '.' || i == (text.length()-1) ) {
                String substr = text.substring(pos, i+1);
                pos = i+1;
                if (checkStr(substr, avaibleNumOfWords)) System.out.println(substr); 
            }
        }
        
    }
    
    private static boolean checkStr(String s, int c) {
        
        int counter = 0;
        
        boolean f = false;
        for (int i = 0; i < s.length();) {

            while ( i < s.length() && !Character.isAlphabetic(s.charAt(i)) ) i++;
            if (i >= s.length()) break;
            while ( i < s.length() && Character.isAlphabetic(s.charAt(i)) ) i++;
            counter++;
            if (i >= s.length()) break;
            
        }
        
        return (counter == c);
        
    }
    
}