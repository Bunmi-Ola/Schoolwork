
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
public class Lab6 {
     public static void main(String[] args){
         int number, guess;
         
         //obtain a random number 0 or 1
         number = (int) (Math.random() * 2);
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("Guess head or tail? Enter 0 for head and 1 for Tail");
         guess = keyboard.nextInt();
         
         if (guess == number){
             System.out.println("Correct guess");
         }
         else
             System.out.println("Wrong guess");
         
             
         
         
         
     }
}
