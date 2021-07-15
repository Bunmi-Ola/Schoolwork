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
public class JavaLoopA6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double litersOfFuel=1; 
        int mileage = 1;
        int tank=1;
        double litersPerKilometers = 0;
        double totalLitersofFuel=0;
        double averageFuelused=0;
        double totalmileage=0;
        double averagemileage=0;
        double totallitersPerKilometers=0;
        double averagelitersPerKilometers=0;
    
    System.out.println("\t\t" + "Mileage\t\t" + "Liters Of Fuel\t\t" + "Liters used per 100 kilometers"); 
    
        while (mileage !=0 && litersOfFuel !=0){
            System.out.println("Enter 0 value for either mileage and liter of Fuel to exit");   
            System.out.print("Enter mileage for tank" + tank + "  ");   
            mileage = input.nextInt(); 
            
            System.out.print("Enter litersOfFuel for tank" + tank + "  ");   
            litersOfFuel = input.nextInt(); 
            tank++;  
            
              if (mileage !=0 && litersOfFuel !=0){
                  litersPerKilometers =litersOfFuel * (100 / mileage);
                  System.out.println("tank " + (tank-1) + "\t\t" + mileage +"\t\t" + litersOfFuel +"\t\t\t" + litersPerKilometers%.2f);
             }
        }        
         totalmileage = totalmileage + mileage;
         averagemileage = totalmileage/tank;  
         
         totalLitersofFuel = totalLitersofFuel + litersOfFuel;
         averageFuelused = totalLitersofFuel/tank;
         
        totallitersPerKilometers= totallitersPerKilometers + litersPerKilometers;
        averagelitersPerKilometers= totallitersPerKilometers/tank;
        
        
    System.out.println();    
    System.out.println("Average is:\t " + averagemileage + "\t\t" + averageFuelused +"\t\t\t" + averagelitersPerKilometers%.2f); 
       
    }   
}


