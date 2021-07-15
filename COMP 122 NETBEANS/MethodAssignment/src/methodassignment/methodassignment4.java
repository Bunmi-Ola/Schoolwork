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
public class methodassignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        
        String playAgain= "Y";
        String Yes = "Y";
                
        while (playAgain.equals(Yes)){
         
        int a =1 + rand.nextInt(1000);
        int b=0;
        int guess = guessNumber(b);
        
        while(guess!=a){
            
        if (guess> a) {     
        System.out.println("Guess Too high, guess again");
        guess = guessNumber(b);
        }  
        
        else if (guess < a){
        System.out.println("Too low, guess again");
        guess = guessNumber(b);
       }
        if (guess == a){          
        System.out.println("Congratulations, you guessed the number" + "\n"); 
        }
    }   
        System.out.println("Do you want to play again? Y or N" ); 
        playAgain = input.next();
       
        }
       if (playAgain  != Yes){
       System.out.println("Game over" );} 
    }
     public static int guessNumber(int a) {
       Scanner input = new Scanner (System.in);
        
        System.out.println("Please guess a number " );
        a = input.nextInt();
        
        while (a <1 || a >1000){   
        System.out.println("invalid number, please pick a number between 1 & 1000" );
        a = input.nextInt();
         
        }
        return a;
        
    }
}
