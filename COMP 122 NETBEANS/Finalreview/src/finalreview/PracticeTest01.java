/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalreview;

import static finalreview.ArrayMethods.setElement;

/**
 *
 * @author olanrewaju4401
 */
public class PracticeTest01 {
    
  public static void main(String[] args) {
    String [] names = {"Gerry", "Lindsey", "Erin", "Brett"};

    double [] hours = {40.0, 38.25, 39.50, 18.75};

    double [] rate = {15.67, 8.90, 8.90, 12.33};
    
    ArrayMethods.averageofIntegers(names, hours);
    
    double [] totalPay = ArrayMethods.calculatePay(rate, hours);
    
    System.out.println("WeeklyPay for each employee");
     for (int i = 0; i< hours.length; i++){      
        
         System.out.println (names [i]+ " " + totalPay [i]); 
     }
     System.out.println ();
     setElement (2, 40.00, hours);
    }
    
}
