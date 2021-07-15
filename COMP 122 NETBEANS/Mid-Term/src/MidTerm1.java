
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olanrewaju4401
 */
public class MidTerm1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
       
        int numumberOfInput = 10;
        int highestNumber = 0;
        int lowestNumber= 1000000000;
        int numberofEvenNumber = 0;
        double averageoftheNumber = 0;
        int sumoftheNumber = 0;
        
         for (int i=0; i<numumberOfInput; i++){
             
            System.out.print("Number" + (i + 1)+ ": ");       
            int number = input.nextInt(); 
         
            
            if (highestNumber < number){
                highestNumber = number;
            }    
            
            if (lowestNumber >=number){
               lowestNumber = number;
            }    
            
            if (number %2==0) {
               numberofEvenNumber++;     
            }                       
            sumoftheNumber += number;
         }
         
        averageoftheNumber = sumoftheNumber/numumberOfInput;
        
        System.out.println ("Hightest Number is: " + highestNumber);
        System.out.println ("Lowest Number is: " + lowestNumber);
        System.out.println ("Number of Even Number is: " +numberofEvenNumber);
        System.out.println ("Average of the Numbers is: " + averageoftheNumber);
        
    }
    
}
