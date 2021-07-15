/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodassignment;

import java.util.Scanner;

/**
 *
 * @author Favour
 */
public class MethodAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double f;
        System.out.println("enter the Fahrenheit " );
        f = input.nextDouble();
        double c = Celsius (f);
        System.out.println("Celsius equivalent is " + c);
        
        
        double cel;
        System.out.println("enter the Celsius " );
        cel = input.nextDouble();
        double fah = Fahrenheit (cel);
        System.out.println("Fahrenheit equivalent is " + fah);
    }
    
    public static double Celsius (double Fahrenheit) {
        double celsius =  5.0/9.0*(Fahrenheit-32);
        
        return celsius;
    }
    
    public static double Fahrenheit (double Celsius) {
        double Fahrenheit =  (9.0/5.0)*(Celsius+32);
        
        return Fahrenheit;
    }
    
}
