/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodlap;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class Lap3 {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        
        double c;
        System.out.println("Enter the circumference: " );
        c = input.nextDouble();
       
        double r = radiusofcircle(c);
        System.out.println("The radius is: " + r +"\n");
               
        double h;
        System.out.println("Enter the height: " );
        h = input.nextDouble();
        
        double v = volumeofcylinder(r,h);
        System.out.println("The volume of cylinder is: " + v);
        System.out.println();
        
        double cone = volumeofcone(r,h);
        System.out.println("The volume of cone is: " + cone);
        
    }
     
    public static double radiusofcircle(double a) {
       double radius = a/(2*3.14159);
        return radius; 
    }
   
    public static double volumeofcylinder(double r, double h) {
       
        double volumeofcylinder = 3.14159*(r*r)*h;
        
        return volumeofcylinder;
    }
    
    public static double volumeofcone(double r, double h) {
        
        double volumeofcone = 3.14159*(r*r)*(h/3);
        
        return volumeofcone;
        
    }
    
}
