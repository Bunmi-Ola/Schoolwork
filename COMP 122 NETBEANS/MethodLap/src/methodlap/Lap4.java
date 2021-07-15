/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodlap;

import java.util.Scanner;
import static methodlap.Lap3.volumeofcone;
import static methodlap.Lap3.volumeofcylinder;

/**
 *
 * @author olanrewaju4401
 */
public class Lap4 {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        
        double cir;
        System.out.println("Enter the circumference: " );
        cir = input.nextDouble();
        
        double Heightcone;
        System.out.println("Enter height of the cones: " );
        Heightcone = input.nextDouble();
        
        double Heightbin;
        System.out.println("Enter the height of the bin: " );
        Heightbin = input.nextDouble();
        
        double heightcylinder = Heightbin - Heightcone;
        
        double radius = cir/(2*3.14159);
        
        double volumeofbin = volumeofcylinder(radius,heightcylinder)+ (volumeofcone(radius,Heightcone)*2);
        
        System.out.println("Volumn of bin " + volumeofbin);
        
        double diameter = 2*radius;
        
        double capacity = 0.628 * diameter * diameter * Heightbin;
        System.out.println("Capacity of the bin is " + capacity + " in bushels");
        
        
    }
}

