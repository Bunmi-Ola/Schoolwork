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
public class Midtermpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        int passengers; 
        double buses=0, vans=0;
        
        System.out.println("enter the number of passengers " );
        passengers = input.nextInt();
        
        if (passengers >= 64){
            buses = passengers/64;
            vans = ((passengers)-(buses*64))/15;
        }
        
        
        if (passengers < 46){
            vans = passengers/15;
            buses = 0;
        }
        
        if (passengers> 46 && passengers < 64){
            buses = 1;
            vans = 0;
        }
        
      System.out.println("Number of buses to be use is " + Math.ceil (buses));  
      System.out.println("Number of vans to be use is " + Math.ceil (vans));  
    }
    
}
