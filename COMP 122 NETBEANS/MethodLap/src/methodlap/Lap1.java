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
public class Lap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
    
    double a;
    System.out.println("Enter a number: " );
    a = input.nextDouble();
    double a2 = roundTo2(a);
    System.out.print("Round number of a: " + a2);
    }
    
    public static double roundTo2(double num){
       
        //5.1273456  * 100 = 512.73456
        //512.73456 + .5 = 513.23456
        //(int)513.23456 = 513
        //513/100 = 5.13
     
        double temp = num*100;
        temp = temp + 0.5;
        int truncate = (int)temp;
        temp = truncate/100.00;
       
         return temp;
     }
}
