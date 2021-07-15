/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class ShippingTest {
    
     public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         
        int Gerryid = 1236;
        String destination = "Gerry's house";
        int height = 15;
        int width = 10;
        int depth = 20;
        double weight = 2.5;
        
      
        ShippingPackage Package1 = new ShippingPackage(Gerryid, destination, height, width, depth, weight); 
        
        System.out.println("Shipping details of Package1 is \n"+ Package1.toString());
        double GerryShippingCost = Package1.computeShipping();
        
        System.out.println("Shipping cost of Package1 is "+ GerryShippingCost + "\n");
        
        System.out.println("Empty Package");
        ShippingPackage emptyPackage = new ShippingPackage(); 
        emptyPackage.setId(3278);
        int SusanID  = 3278;
        emptyPackage.setDestination("Susan's House");
        System.out.print ("Please enter the Height: ");
        emptyPackage.setHeight(input.nextInt());
        System.out.print ("Please enter the width: ");
        emptyPackage.setWidth(input.nextInt());
        System.out.print ("Please enter the depth: ");
        emptyPackage.setDepth(input.nextInt());
        System.out.print ("Please enter the weight: ");
        emptyPackage.setWeight(input.nextDouble());
        double SusanShippingCost = emptyPackage.computeShipping();
        
        System.out.println("Shipping cost of Susan Package is "+ SusanShippingCost);
        
        int numberofPackages = ShippingPackage.getNumberShipped();
        System.out.println("Number of packages shipped is " + numberofPackages);
        
        double highestShippingCost;
        if (GerryShippingCost > SusanShippingCost){
            highestShippingCost = GerryShippingCost;
            System.out.println("The ID of the highest shipping cost is : "+ Gerryid + " with cost of " + GerryShippingCost );
        }
        else 
        highestShippingCost = SusanShippingCost;
        
        System.out.println();   
        System.out.println("The ID of the highest shipping cost is : "+ SusanID + " with cost of " + SusanShippingCost);
        
     }
    
}
