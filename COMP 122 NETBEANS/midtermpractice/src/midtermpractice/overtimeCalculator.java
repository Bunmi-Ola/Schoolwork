/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermpractice;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class overtimeCalculator {
    
    public static void main(String[] args) {
        
       
        Scanner scan= new Scanner(System.in);
        
        int hoursworked=0;
        double PayEarned=0;
        
        do{    
        System.out.println("Insert hours worked");
        hoursworked =scan.nextInt();
        System.out.println("Insert payRate");
        double PayRate=scan.nextDouble();
        PayEarned = calculatePay(hoursworked, PayRate);
        System.out.println("The Pay Earned is " + PayEarned );
       
        }
        while (hoursworked>0);
        
        if (PayEarned<=0){
           PayEarned = 0; 
           System.out.println("End of program"); 
        }
        
   }
        
   
       
    public static double calculatePay( int hours, double payRate)
    {
        double payearned=0;
        if(hours>40)
        {
          payearned = (40*payRate)+((hours-40)*payRate*1.5);  
        }
        else
        {
            payearned=hours*payRate;
        }
        return payearned;
    }
}