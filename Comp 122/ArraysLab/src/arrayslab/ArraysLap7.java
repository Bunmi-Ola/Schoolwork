/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayslab;
import java.util.Arrays;

/**
 *
 * @author Favour
 */
public class ArraysLap7 {
    
     public static void main(String[] args) {
         
         int [] sample1 = {1, 2, 2, 1, 1, 3, 3, 2, 2, 1};
         int [] sample2 = {3, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2, 3, 3, 2, 2, 2, 3};
         int [] sample3 = {1, 1, 1, 2, 2, 1, 3, 2, 1, 1, 1, 2};
        
         int[] results = new int [sample1.length + sample2.length + sample3.length];
         
         System.arraycopy( sample1, 0,  results, 0,sample1.length);
         System.arraycopy( sample2, 0,  results, sample1.length, sample2.length);
         System.arraycopy( sample3, 0,  results, sample1.length + sample2.length, sample3.length);
         
         System.out.println( Arrays.toString(results)); 
         ;
         
         int countone = ArrayMethods.countOccurances (results,1);
         int counttwo =ArrayMethods.countOccurances (results,2);
         int countthree =ArrayMethods.countOccurances (results,3);
         
         int percentofOne = (countone*100)/results.length;
         int percentofTwo = (counttwo*100)/results.length;
          int percentofThree = (countthree*100)/results.length;
         
         System.out.println( ); 
         System.out.println( countone + " people rated the cafeteria food as awful"); 
         System.out.println( counttwo + " people rated the cafeteria food as ok"); 
         System.out.println( countthree + " people rated the cafeteria food as delicious"); 
         
         System.out.println( ); 
         System.out.println( percentofOne + "% of people rated the cafeteria food as awful"); 
         System.out.println( percentofTwo + "% of people rated the cafeteria food as ok"); 
         System.out.println( percentofThree + "% of people rated the cafeteria food as delicious");
        
     } 
}
