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
public class ArrayMethods {
    public static int getMinIndex(int [] array) {
       
        int minValue = array[0];
        int minvalueIndex = 0;
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] < minValue) {
                minValue = array[i];
                minvalueIndex = i;  
            }
        }
        return minvalueIndex;
    }   
    
     public static int[] randomintegers(int side) 
    { 
        int [] numbers = new int [side];        
        for (int i = 0; i< numbers.length; i++)
        { 
            int r = (int) (Math.random()* 100+1);
            numbers [i] = r;
        } 
        return numbers;
    }   
     
    public static int averageofIntegers(int[]numbers) {        
          int sumofIntegers = 0;
          int AverageofIntegers = 0;          
        
        for (int i = 0; i< numbers.length; i++){
        sumofIntegers = sumofIntegers + numbers[i];       
        } 
        AverageofIntegers = sumofIntegers/numbers.length;
        return  AverageofIntegers;
    }
    
    public static int []getrandomnumbers (int a){
        
        int [] numbers = new int [a];
        
        for (int i = 0; i< numbers.length; i++){
            
            int r = (int) (Math.random()* 100+1);
            numbers [i] = r; 
       }
        return numbers;
    }
     public static double[] randominteger (int side) {
        
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
        }
         AverageofIntegers = sumofIntegers/numbers.length;
        return  AverageofIntegers;
    }
     public static int getMinValue(int [] array) {
        int side = 10; 
        array = randomintegers (side); 
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }   
      public static double[] round(double[] numbers) {
     double [] roundnumber = new double [numbers.length];   
    
     for (int i =0; i < numbers.length; i++){
         roundnumber[i] = (numbers[i]*100)+5;
         roundnumber[i] = Math.round(roundnumber[i]);
         roundnumber[i] = roundnumber[i]/100;         
     }
     return roundnumber;
     }     
      
       public static int countOccurances(int[] arrays, int value){         
         int count = 0;
         for (int i =0; i < arrays.length; i++){
               if (arrays[i] == value){
                   count++;   
               }
         }
         return count;      
       }
}


