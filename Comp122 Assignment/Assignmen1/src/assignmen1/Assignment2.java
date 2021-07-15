/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmen1;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class Assignment2 {
    
    public static void main(String[] args){
 
        Scanner keyboard = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print ("Please enter number1:");

        number1 = keyboard.nextInt();

        System.out.print ("Please enter number2:");

        number2 = keyboard.nextInt();

        if (number2 % number1 == 0) {

            System.out.println("Number1 is a multiple of Number2");

        }
        else{ 

            System.out.println("Number1 is not a multiple of Number2");
        }     
       
    }
}

