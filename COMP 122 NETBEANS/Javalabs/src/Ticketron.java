/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olanrewaju4401
 */
import java.util.Scanner;

public class Ticketron {
    
    //input.nextInt()for reading ints from keyboard
    
    public static void main(String[] args){
        
            int numberOfTickets;
            double totalCostOfTickets;
            double discountAmount=0;
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.print ("Please enter the number of tickets:");
            numberOfTickets = keyboard.nextInt();
            
            totalCostOfTickets = numberOfTickets * 15.99;
            
            if (numberOfTickets > 9) {
                discountAmount = totalCostOfTickets * .15;
            }
            
            totalCostOfTickets = totalCostOfTickets - discountAmount;
 
                    
            System.out.printf("Total cost is %.2f/n", totalCostOfTickets );
            
            if(discountAmount != 0){
            
                System.out.printf("Total discount was %.2f/n", discountAmount );
            System.out.println ("you got a discount!!!");
    } 
            
    }
}
