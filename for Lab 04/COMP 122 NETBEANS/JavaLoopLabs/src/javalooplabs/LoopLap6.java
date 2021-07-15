/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalooplabs;

/**
 *
 * @author olanrewaju4401
 */
public class LoopLap6 {
    public static void main(String[] args){
       
      System.out.println("Kilogram\t" + "Pounds");  
      
        for (int Kilogram =1;  Kilogram < 200; Kilogram++){
            
            double Pounds = Kilogram*2.2;
            if (Kilogram % 2 != 0){
                        System.out.printf(Kilogram +"\t\t%.2f\n",  Pounds );
            }
        }
    }
}
