/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

/**
 *
 * @author olanrewaju4401
 */

import java.util.Scanner;

public class LAB12 {
    
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        int number1;
        int number2;
        int number3;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
                
       System.out.print ("Please enter the three number:");
        
       number1 = keyboard.nextInt();
        
       number2 = keyboard.nextInt();
        
       number3 = keyboard.nextInt();
        
                                 
        if (number1 > number2 && number1 > number3 && number2 > number3) 
        
        { p1 = number3;
          p2 = number2;
          p3 = number1;
        }
       
       if (number1 > number2 && number1 > number3 && number3 > number2) 
        { p1 = number2;
          p2 = number3;
          p3 = number1;
          
        }
                     
       if (number2 > number1 && number2 > number3 && number1 > number3) 
        { p1 = number3;
          p2 = number1;
          p3 = number2;
        }    
                       
        if (number2 > number1 && number2 > number3 && number3 > number1) 
        { p1 = number1;
          p2 = number3;
          p3 = number2;
        }
                   
        if (number3 > number1 && number3 > number2 && number2 > number1) 
        { p1 = number1;
          p2 = number2;
          p3 = number3;  
        }
                     
        
       if (number3 > number1 && number3 > number2 && number1 > number2) 
        { p1 = number2;
          p2 = number1;
          p3 = number3; 
        }
                        
       System.out.println("Sorted list of integers:");
       System.out.println(p1);
       System.out.println(p2);   
       System.out.println(p3);
    }
}
        

            
                   
          