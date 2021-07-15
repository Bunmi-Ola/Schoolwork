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
public class ShippingCalcualtor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int widgetsNumber;
        System.out.println("Please enter the number of Widgets ");
        widgetsNumber = input.nextInt();
        int cratesNumber = calculateCrates(widgetsNumber);
        double ShipmentCost = calculateShipping(cratesNumber);
        int leftOverWidgets = widgetsNumber%18;
        
        System.out.println("Number of crates being shipped is " + cratesNumber);
        System.out.println("The cost of shipping is " + ShipmentCost);
        System.out.println("The left over widgets is " + leftOverWidgets);
    }
    public static int calculateCrates (int widgets){
    
    int crates = widgets/18;
        
    return crates;
    }
    
    public static double calculateShipping( int crates ){
       
      double costofShipping=0;
      
      if (crates <=10){
          costofShipping = (crates * 7.50);          
      }
      
      if (crates >10){
          costofShipping = (10 * 7.50) + ((crates-10)*5.50);          
      }
      
      return costofShipping;
    }
}
