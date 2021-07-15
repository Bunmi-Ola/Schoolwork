/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodassignment;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author olanrewaju4401
 */
public class methodassignment3 {
    
    public static void main(String[] args) {
        
           
        int Headcount=0, Tailcount=0;
        
        boolean coinResult = flip();
        
                
        for (int a =0; a !=2; a++){
            
            if (coinResult==true){
                Headcount++;
        }
            else 
                Tailcount++;
        }
        
        System.out.println("number of times Head appears is " + Headcount);
        System.out.println("number of times Tail appears is " + Tailcount);
    }
    
    public static boolean flip( )  {
        Random rand = new Random();
        
        int coinface = 1 + rand.nextInt(2);
        
        if (coinface == 1){
            return true; //head
        }          
        
        else {
            return false; //tail
        }
        
}
}