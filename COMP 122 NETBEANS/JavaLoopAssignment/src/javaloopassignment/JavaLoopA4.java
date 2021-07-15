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
public class JavaLoopA4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double litersOfFuel=0; 
        int mileage = 0;
        double litersPerKilometers = 0;
       
        
      System.out.print("\t" + "Mileage\t\t" + "Liters Of Fuel\t\t" + "Liters used per 100 kilometers"); 
        for (int i=1; i<4; i++){
                             
            mileage = input.nextInt(); 
            litersOfFuel = input.nextInt(); 
                        
              System.out.print("tank" + i + "\t" + mileage +"\t\t" + litersOfFuel +"\t\t\t" + litersPerKilometers%.2f);
            
            litersPerKilometers =litersOfFuel * (100 / mileage);
           
            } 
        
       
    }   
}
