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
        
        double litersOfFuel=0; 
        int mileage = 0;
        double litersPerKilometers = 0;
       
       
        
      System.out.println("\t" + "Mileage\t\t" + "Liters Of Fuel\t\t" + "Liters used per 100 kilometers"); 
      
     for (int i=1; i != 0; i++){
         
            mileage = input.nextInt(); 
            litersOfFuel = input.nextInt(); 
            litersPerKilometers =litersOfFuel * (100 / mileage);
            System.out.println("tank" + i + "\t" + mileage +"\t\t" + litersOfFuel +"\t\t\t" + litersPerKilometers%.2f);            
           

              while (mileage !=0 || litersPerKilometers!=0);{
               
                         
               
              }
            
         }
          
      System.out.println("end"); 
        }
    
}


