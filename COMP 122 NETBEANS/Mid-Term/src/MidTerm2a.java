
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
public class MidTerm2a {
    
    public static void main(String[] args) {
        
        int highNumber = 100;
        int lowNumber = 0;
        String OutputMessage = "Not a valid grade, please reenter";
                
        int input = getValidInput(lowNumber, highNumber, OutputMessage);
        
    }
    
     public static int getValidInput (int low, int high, String message) {
        
        Scanner input = new Scanner (System.in);
        
        int number;
         
        System.out.println("Please eneter a number between high and low; ");
        number = input.nextInt();  
        
        if (high < low)
        {            
            return -1;
        }
        
        while (number <low || number >high){        
        System.out.println(message);
        number = input.nextInt();
        }        
         
       return number;  
     }
}
