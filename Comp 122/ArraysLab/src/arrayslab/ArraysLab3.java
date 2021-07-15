/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslab;

/**
 *
 * @author olanrewaju4401
 */
public class ArraysLab3 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int numbersize = 20, aboveaverage = 0;
   
    
    double[] integers = ArrayMethods.randominteger (numbersize);
    
    double average = ArrayMethods.averageofIntegers(integers);
      
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
 
