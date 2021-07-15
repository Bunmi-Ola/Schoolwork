/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysassignment;

import java.util.Arrays;

/**
 *
 * @author olanrewaju4401
 */
public class ArrayassignmentMethod {
    
    
     public static int belowAverageOccurances(double[] arrays, double value){         
         int count = 0;
         for (int i =0; i < arrays.length; i++){
               if (arrays[i] < value){
                   count++;   
               }
         }
         return count;      
       }
    
     public static double[] reverseSort(double[] arrays){    
                 
         Arrays.sort(arrays, 0, arrays.length);
       // double[] sortedArray = new double[arrays.length];
        // for (int i =0; i < arrays.length-1; i++){             
         
          //   for (int j = i+1; j < arrays.length; j++){                 
                 
         //      if (arrays[i] > arrays[j]) {
           //         temp = arrays[i];  
          //          arrays[i] = arrays[j];
           //         arrays[j] = temp;
           //         sortedArray = arrays;                    
            //   }
          //   }   
       //  }
           System.out.print("Array in ascending order: ");
          for (int i = 0; i<  arrays.length; i++){
            System.out.print( arrays[i] + " ");
           }
         System.out.println();
         
         System.out.print("Array in descending order: ");
        for (int i = arrays.length - 1; i >= 0; i--){
	System.out.print( arrays[i] + " ");
        }
         return  arrays;      
       }
     
     public static int[] getFinalGrades(int[] mid, int[] fin, int[] ass, int size){
        int []finalGrade = new int [size];
                
        for (int i =0; i < finalGrade.length; i++){
            finalGrade[i] = (int) ((0.15*ass[i]) + (0.4 *mid[i]) + (0.45*fin[i]));
        } 
       return finalGrade; 
    }
     
     public static int findFrequency(int[] array, int Value){
         int valuecount=0;
         for (int i =0; i < array.length; i++){
             if (array[i]>= Value)valuecount++;
         }
       return valuecount;
     }
}
