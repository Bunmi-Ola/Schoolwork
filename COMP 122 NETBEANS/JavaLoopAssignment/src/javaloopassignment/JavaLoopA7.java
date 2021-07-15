/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloopassignment;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class JavaLoopA7 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
       
        int quantity;  
        int choice=0;
        double payment=0; 
        double amountPaid=0;    
        double change=0; 
        int toonies=0;
        int loonies=0;
        int quarters=0;
        int dimes=0;
        int nickels=0;
        int pennies=0; 
       double tbal = 0;
        double lbal = 0;
        double qbal = 0;
        double dbal = 0;
        double nbal = 0;
        double pbal=0; 
        
                    
        System.out.println("1. CandyBar");
        System.out.println("2. Mints");
        System.out.println("3. Gum");
        System.out.println("4. Drink");
        System.out.println("5. Exit program");
       
        System.out.println("Please select a product");
      
        choice = input.nextInt();
       
       
        
        while (choice<1 || choice>5)
           
        {
          System.out.print("Invalid input. Please reenter a product");
          choice = input.nextInt();
          
        }                
            if (choice == 1)
            {
            System.out.print("Please select quantity :");
            quantity = input.nextInt();
            payment = (0.85 * quantity);
            System.out.println("Your payment is: " +"$"+ payment);            
        } 
            
            if (choice == 2)
        {
            System.out.print("Please select quantity :");
            quantity = input.nextInt();
            payment = (0.65* quantity);
            System.out.println("Your payment is: "+"$" + payment);
        }
            
            if (choice == 3)
        {
            System.out.print("Please select quantity :");
            quantity = input.nextInt();
            payment = (0.75* quantity);
            System.out.println("Your payment is: "+"$" + payment);
        } 
            
            if (choice == 4)
        {
            System.out.print("Please select quantity :");
            quantity = input.nextInt();
            payment = (1* quantity);
            System.out.println("Your payment is: " +"$"+ payment);                    
         }
             if (choice == 5)
        {
            System.out.print("Exit Program");
                          
         }
          
         if(choice!=5){
            System.out.println("Enter amount paid ");
            amountPaid = input.nextInt();
            change = amountPaid - payment;
            System.out.println("Your change is: "+"$" + change );
            
            toonies = (int) (change / 2);
            tbal = change - (2*toonies);
                        
            loonies = (int) (tbal / 1);
            lbal = tbal - (1*loonies);
                       
            quarters = (int) (lbal /0.25);
            qbal = lbal - (0.25*quarters);
                    
            dimes = (int) (qbal /0.10);
            dbal = qbal - (0.10*dimes);
                    
            nickels = (int) (dbal /0.05);
            nbal = dbal - (0.05*nickels);
                       
            pennies = (int) (nbal /0.01);
            pbal = nbal - (0.01*pennies);
         
            System.out.println("Your balace is\n " + toonies + " tonnies\n" + loonies + " loonies\n" + quarters + " quarter\n" + dimes + " dimes\n" + nickels + " nickels\n" + pennies + " Pennies\n");
        }
            
     
                
    }
    
}