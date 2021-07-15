/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

/**
 *
 * @author olanrewaju4401
 */
public class Final01 { public static void main(String[] args) {
        // TODO code application logic here
   
    String [] name = {"Gerry", "Lindsey", "Erin", "Brett", "Bob"};

    int [] units = {12, 42, 51, 34, 76};

    double [] commissionRate  = {.07, .075, .05, .08, .05};

   String personwithHighestSales = ArrayMethods.personWithHighestSales(units, name);
   int HighestUnitSold = ArrayMethods.HighestUnitSold(units, name);
   
   System.out.println("Person with highest units sold is " + personwithHighestSales );
  
   System.out.println("Highest units sold is " + HighestUnitSold );
   System.out.println("\n");  
   
   double [] WeeklyPay = ArrayMethods.calculatePay(commissionRate, units);      
   
   System.out.println("WeeklyPay for each employee");
     for (int i = 0; i< name.length; i++){      
        
         System.out.println (name [i]+ " " + WeeklyPay [i]); 
     }
      System.out.println("\n");  
     
   System.out.println("Revised Commission");     
   double [] newcommissionRate = ArrayMethods.setCommission(units, commissionRate);
   for (int i = 0; i< name.length; i++){      
  
   System.out.println(name[i] + " " + newcommissionRate[i]);
       
     }
   }

}


