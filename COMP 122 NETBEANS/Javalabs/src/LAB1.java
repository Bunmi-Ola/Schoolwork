/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olanrewaju4401
 */

import java.util.Scanner;

public class LAB1 {
    
    public static void main(String[] args){
        
        
        
        int number; 
        
         Scanner keyboard = new Scanner(System.in);
         
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
