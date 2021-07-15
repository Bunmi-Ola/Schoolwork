/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslab;

/**
 *
 * @author Favour
 */
public class ArraysLap5 {
    
    public static void main(String[] args) {
        
     int Numbersize = 10;     
     int []Integers = ArrayMethods.randomintegers(Numbersize); 
     int MinvalueIndex = ArrayMethods.getMinIndex (Integers);
     
        System.out.println();
        System.out.print("The index of the smallest value in an array of integers is " + MinvalueIndex);
}

    
}