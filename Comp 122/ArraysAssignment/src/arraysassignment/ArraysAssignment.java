/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysassignment;

import java.util.Arrays;

/**
 *
 * @author olanrewaju4401
 */
public class ArraysAssignment {

   
    public static void main(String[] args) {
        // TODO code application logic here
    double [] closingPrice = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};
    double [] priceSummary = new double [3];
    
     double highestclosingprice = 0;
     double lowestclosingprice = 1000;
     double sumofclosingprice = 0;
     double averageclosingprice = 0;
     double costofOneStock = 0;
     
        
      for (int i = 0; i < closingPrice.length; i++){
          if (highestclosingprice < closingPrice[i]){
              highestclosingprice = closingPrice[i];
          }     
      }       
      for (int i = 0; i < closingPrice.length; i++){
          if (lowestclosingprice > closingPrice[i]){
              lowestclosingprice = closingPrice[i];
          }     
      }   
    for (int i = 0; i < closingPrice.length; i++){
          sumofclosingprice += closingPrice[i];               
          }  
        averageclosingprice = sumofclosingprice/closingPrice.length;
        
    for (int i = 0; i < closingPrice.length; i++){  
        costofOneStock += (1*closingPrice[i]);
    }  
    priceSummary[0]= highestclosingprice;
    priceSummary[1]= lowestclosingprice;
    priceSummary[2]= averageclosingprice;
    
    
            
    System.out.println("Highest Closing Price is: " + highestclosingprice);
    System.out.println("Lowest Closing Price is: " + lowestclosingprice);
    System.out.println("Average Closing Price is: " + averageclosingprice);
    
    int belowAverage = ArrayassignmentMethod.belowAverageOccurances(closingPrice,averageclosingprice);
    
    System.out.print ("priceSummary: ");
    for (int i = 0; i < priceSummary.length; i++){
        System.out.print ( priceSummary[i] +", ");
    }
    System.out.println();
    System.out.println("Number of days average price below closing price: " + belowAverage);
    System.out.println("The cost to buy one stock at each closing price : " + costofOneStock);

    double []Sortedclosingprice = ArrayassignmentMethod.reverseSort (closingPrice);
    
  
}    
    
     
     
}
