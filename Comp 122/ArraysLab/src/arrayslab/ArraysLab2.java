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
public class ArraysLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     int size = 10;   
     int [] Numbers = ArrayMethods.randomintegers (size);   
     
     for (int i = 0; i< Numbers.length; i++){
         System.out.print(Numbers[i] + " ");
     }
       System.out.println();
     for (int i = Numbers.length - 1; i >= 0; i--)
	System.out.print(Numbers[i] + " ");
	
    }
    
}
