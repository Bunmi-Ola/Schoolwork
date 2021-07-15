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
public class loopDemo2 {
    
    public static void main(String[] args) {
        
        //Controls the number of times the while loop executes
        double counter = 0;
      
        //hold the number of even numbers entered
        int numberOfEven =0;
        
        //hold the percentage of even numbers
        double percentageOfEven;
        
        //hold the number entered by the user
        int userInput=0;
        
        //create a scanner to read from keyboard
        Scanner keyboard = new Scanner(System.in);
        
        while(userInput !=-1){
        
            System.out.print ("Enter a number: (-1 to exit) ");
            userInput = keyboard.nextInt();
            counter++;
            
            //if (userInput != 1 && userInput%2==0){
            if (userInput%2==0){
                numberOfEven++; 
             }    
        }
        
        //percentageOfEven = numberOfEven/17*100;
        percentageOfEven = numberOfEven/counter*100;
        
        System.out.println("Thanks for the numbers! " + percentageOfEven + " were even");
        
        
    }
    
}


