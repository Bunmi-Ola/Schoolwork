/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalreview;

import java.util.Arrays;

/**
 *
 * @author olanrewaju4401
 */
public class ArrayMethods {

    /**
     * @param args the command line arguments
   
   */
    public static void averageofIntegers (String [] names, double []hours) {
        
          String employeeWhoWorkedMost = "";
          double LongestHoursWorked = 0;          
       
        for (int i = 0; i< hours.length; i++){
        if (LongestHoursWorked < hours[i]){
              LongestHoursWorked = hours[i];             
              employeeWhoWorkedMost = names[i];        
         }
      }
        System.out.println("Employee who worked the most hours during the week is " +  employeeWhoWorkedMost +", working " + LongestHoursWorked + " hours.");
   }
    
    public static double [] calculatePay (double [] rate , double []hours) {
        double [] TotalPay = {1, 1, 1, 1};
         for (int i = 0; i< hours.length; i++){
             TotalPay [i] = hours[i] * rate[i];            
         }
         return TotalPay;
    }
    
     public static void setElement (int index, double value, double [] hours) {
          double Hours = hours[0];
          
         for (int i= 0; i< hours.length; i++){             
                Hours = hours[index];                
             }   
             hours[index] = value; 
             System.out.println ("Value of hours in array index " + index + " was changed from " + Hours +" to " + value);
             //System.out.println ("Value of hours in array index " + index + " was changed from " + Arrays.toString(hours) +" to " + value);
         }
        
    
}
