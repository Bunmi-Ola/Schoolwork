/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmen1;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class Assignmen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
     Scanner keyboard = new Scanner(System.in);
        
    int number; 
        
        System.out.print ("Type a number");
        
        number = keyboard.nextInt();
            
        if (number %2==0) {
        
    System.out.println("it is an even number");
         
            }
            else{ 
                     
                System.out.println("It is an odd number");
         }     
    
    }
    
}
