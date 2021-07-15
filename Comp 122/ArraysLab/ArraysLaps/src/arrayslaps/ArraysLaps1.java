/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslaps;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class ArraysLaps1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int numbersize = 20, aboveaverage = 0;
   
    
    double[] integers = randomintegers (numbersize);
    
    double average = averageofIntegers (integers);
      
        for (int i= 0; i < integers.length; i++){
            
         System.out.println(integers[i]);  
        if (integers[i] > average){
            aboveaverage++;
        }
        }
         System.out.println("average of integers is: " + average + "\n");
         System.out.println("Numbers above average is " + aboveaverage);
    }
 
    public static double[] randomintegers (int side) {
        
        double[] numbers = new double[side];
        
        for (int i = 0; i< numbers.length; i++){
            
            int r = (int) (Math.random()* 100+1);
            numbers [i] = r;
            
        } 
        return numbers;
    }    
    public static double averageofIntegers (double []numbers) {
        
          double sumofIntegers = 0;
          double AverageofIntegers = 0;          
       
        for (int i = 0; i< numbers.length; i++){
        sumofIntegers = sumofIntegers + numbers[i];
        AverageofIntegers = sumofIntegers/numbers.length;
        }
        return  AverageofIntegers;
    }
       
}
 