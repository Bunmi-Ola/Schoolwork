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
public class ArrayMethods {

    /**
     * @param args the command line arguments
     */
    
    public static String personWithHighestSales (int [] units, String [] names){        
    
    String highestSalesPerson = ""; 
    int highestUnitsSold = 0;
    
    for (int i=0; i<units.length; i++){          
             
            if (highestUnitsSold < units[i]){
                highestUnitsSold = units[i];
                highestSalesPerson = names[i];         
              }         
       }
        return highestSalesPerson;
    }
    public static int HighestUnitSold (int [] units, String [] names){        
    
    String highestSalesPerson = ""; 
    int highestUnitsSold = 0;
    
    for (int i=0; i<units.length; i++){          
             
            if (highestUnitsSold < units[i]){
                highestUnitsSold = units[i];
                highestSalesPerson = names[i];         
              }         
       }
        return highestUnitsSold;
    }
    public static double [] calculatePay (double [] commissionRate , int [] units ) {
        double [] WeeklyPay = new double [5];
        double [] sales = new double [5];
         for (int i = 0; i< units.length; i++){
             sales [i] = 4.99 *units[i];
             WeeklyPay [i] = (commissionRate[i] * sales [i]) + sales [i];            
         }
         return WeeklyPay;
    }
    
    public static double [] setCommission (int [] units, double [] commissionRate) {
       
         double [] newCommission = new double [5];; 
         for (int i= 0; i< commissionRate.length; i++){   
             if (units[i] > 50)  {                        
                
             newCommission[i] = commissionRate[i] + (commissionRate[i] * 0.005); 
             }
             if (units[i] < 50)  {                        
                
             newCommission[i] = commissionRate[i] ; 
             }
             //System.out.println ("Value of hours in array index " + index + " was changed from " + Arrays.toString(hours) +" to " + value);
         }
         return newCommission; 
    }
   
}
