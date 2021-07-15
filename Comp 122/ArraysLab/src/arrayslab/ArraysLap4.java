/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslab;

//https://thelackthereof.org/docs/library/cs/courses/cse200/exercises/methodsSolutions.pdf

/**
 *
 * @author Favour
 */
public class ArraysLap4 {
    
    public static void main(String[] args) {
        
     int Numbersize = 10;     
     int []Integers = ArrayMethods.randomintegers(Numbersize); 
     int Minvalue = ArrayMethods.getMinValue (Integers);
     
        System.out.println();
        System.out.print("Smallest value in the array is " + Minvalue);
    }
   
}