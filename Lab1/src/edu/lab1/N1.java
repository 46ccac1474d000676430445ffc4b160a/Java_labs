
package edu.lab1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author osmose
 */



public class N1 {

    public static void main(String[] args) {
        
        Calendar c = new GregorianCalendar();
        c.set(1998, 4, 11);
        Date d = new Date();
        
        System.out.printf("\n%d %d %d\n", c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.MONTH), c.get(Calendar.YEAR));
        System.out.printf("%d %d %d\n\n", d.getDay(), d.getMonth()+1, d.getYear()+1900);
        
        //N2.main(args);
        //N3.main(args);
        
    }
    
}
