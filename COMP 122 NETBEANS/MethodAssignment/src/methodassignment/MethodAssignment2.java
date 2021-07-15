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
public class MethodAssignment2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int a;
        System.out.println("Enter a number " );
        a = input.nextInt();
        
        int reverseA= ReversedNumber(a);
        System.out.println(reverseA );
        }
    
 
    public static int ReversedNumber (int Number) {
            int reversed = 0;
            for(int a = Number; a != 0; a /= 10) {
            int digit = a % 10;
            reversed = reversed*10 + digit ;
            }
            return reversed;
}
}

    
