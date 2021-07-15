/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectassignment;

import java.util.Scanner;

/**
 *
 * @author Favour
 */
public class TestChangeMachine {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        
        ChangeMachine test = new ChangeMachine(5, 20);
        test.isStatus();
        
        test.acceptMoney(20);
        
        test.acceptMoney(20);
        
         test.acceptMoney(20);
                
        int validpin= 333; int inputpin=0;
        
        while (inputpin != validpin){
            System.out.print("Please enter a valid pin ");
            inputpin = input.nextInt();
            if(inputpin == validpin){
                System.out.println( "How many loonines and tonnies is to be inserted ");
                
            }
            
            } 
        test.setLoonies(20);
        test.setToonies(10);
    }
    
}
