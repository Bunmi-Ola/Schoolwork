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
public class JavaLoopA5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double litersOfFuel=0; 
        int mileage = 0;
        int tanksOfFuel;
        double litersPerKilometers = 0;
        double totalLitersofFuel=0;
        double averageFuelused=0;
        double totalmileage=0;
        double averagemileage=0;
        double totallitersPerKilometers=0;
        double averagelitersPerKilometers=0;
       
        System.out.println("Enter number of Tanks of Fuel: ");     
        tanksOfFuel = input.nextInt();
        
    System.out.println("\t\t" + "Mileage\t\t" + "Liters Of Fuel\t\t" + "Liters used per 100 kilometers"); 
      
        for (int i=1; i<= tanksOfFuel; i++){
        
            System.out.print("Enter mileage for tank" + i + "  ");   
            mileage = input.nextInt(); 
            
            System.out.print("Enter litersOfFuel for tank" + i + "  ");   
            litersOfFuel = input.nextInt(); 
            
            litersPerKilometers =litersOfFuel * (100 / mileage);
                   
             System.out.println("tank" + i + "\t\t" + mileage +"\t\t" + litersOfFuel +"\t\t\t" + litersPerKilometers%.2f);
           
         totalmileage = totalmileage + mileage;
         averagemileage = totalmileage/i;  
         
         totalLitersofFuel = totalLitersofFuel + litersOfFuel;
         averageFuelused = totalLitersofFuel/i;
         
        totallitersPerKilometers= totallitersPerKilometers + litersPerKilometers;
        averagelitersPerKilometers= totallitersPerKilometers/i;
          
        }
   System.out.println();    
   System.out.println("Average is:\t " + averagemileage + "\t\t" + averageFuelused +"\t\t\t" + averagelitersPerKilometers%.2f); 
   
    }
}
