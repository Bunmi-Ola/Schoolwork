/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslab;
import java.util.Scanner;

/**
 *
 * @author Favour
 */
public class ArraysLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int numbersize = 20, aboveaverage = 0;
   
    
    int[] integers = ArrayMethods.randomintegers (numbersize);
    
    int average = ArrayMethods.averageofIntegers (integers);
      
        for (int i= 0; i < integers.length; i++){
            
         System.out.println(integers[i]);  
        if (integers[i] > average){
            aboveaverage++;
        }
        }
         System.out.println("average of integers is: " + average + "\n");
         System.out.println("Numbers above average is " + aboveaverage);
    }  
}
 