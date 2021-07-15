/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalooplabs;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class LoopLap4 {
    
    public static void main(String[] args) {
        
            
        int value = 0;
        
        int smallestnumber = 0;
              
        while ( Math.pow(value,2) < 12000){
            
         if(value < smallestnumber);
         smallestnumber =value;
               value++;           
        }
        
        System.out.println("smallest number whose squared value is greater than 12,000  " +value);
            
    }
    
}
