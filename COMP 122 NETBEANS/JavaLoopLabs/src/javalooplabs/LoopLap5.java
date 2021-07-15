/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalooplabs;
import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class LoopLap5 {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int NumberofQuestions = 10;        
        
       int Correct = 0;
        int count=0;
        
     while (count < NumberofQuestions) {
               
            int a = (int) (Math.random() *100+1); 
            int b = (int) (Math.random() *100+1);   
                    
         System.out.print("Enter the sum of  question" +"\n" );
         System.out.print(a +" + "+ b + " = " );
                 
         int Answer =   keyboard.nextInt();
      
         if (a+b == Answer){
             
            System.out.println("You are correct");
            Correct++;
         } 
        else   {
            System.out.println("You are incorrect\n" + a + " + " + b + " should be " + (a + b));  
        }
         count++;
         
     }  
        System.out.println("Total number of correct answer is " + Correct); 
        }
    }
