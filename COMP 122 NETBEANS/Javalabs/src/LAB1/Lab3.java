/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;
import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class Lab3 {
    
    public static void main(String[] args){
        
        
        Scanner keyboard = new Scanner(System.in);
        
        int a = (int) (Math.random() *100+1);
        int b = (int) (Math.random() *100+1);
        int Total;
        
        System.out.println(a);
        System.out.println(b);
        
        System.out.print ("Please enter the sum of the numbers :");
        Total = keyboard.nextInt();
       
                
      if (Total == (a+b))
            {  
                System.out.println("Correct");
            }
        
        else
        {
            System.out.println("Incorrect");
        }           
                
                
        
          
}
}
