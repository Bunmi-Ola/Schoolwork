/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodlap;

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author olanrewaju4401
 */
public class Lap2 {
    
     public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    
    int rand= 0;
    int num = randomNum (rand);
    int guess=0;
       
    System.out.print("Please Guess a numbers (10 attempts only): ");
    guess = keyboard.nextInt();
    
    for (int i=1; i<=10; i++){
     
        if (guess> num) {     
        System.out.println("Guess Too high");
        System.out.print("Please Guess a numbers again: ");
        guess = keyboard.nextInt();}
            
        else if (guess < num){
     
        System.out.println("Too low");
        System.out.print("Please Guess a numbers again: ");
        guess = keyboard.nextInt();}
    
     
        else if (guess == num){
         
        System.out.println("Right Guess"); 
        System.out.println("It took you "+ i + "attempts");
        
        
     }
    }   
        System.out.println("Guessing is over"); 
     
    }

       public static int randomNum(int a) {
       Random rand = new Random();
       a =rand.nextInt(1000);
             
        return a;
     }
    }
     
        


