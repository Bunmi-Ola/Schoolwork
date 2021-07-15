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
public class Assignment3 {
    
public static void main(String[] args){
 
Scanner keyboard = new Scanner(System.in);

 // R = Radius   
 int R;
 
 
System.out.print ("Please enter the Radius: ");

 R = keyboard.nextInt();
 
 
 double C = 2*3.14159* R;
 
 double D = 2* R;
 
 double A = 3.14159* Math.pow(R, 2);
 
 System.out.println ("Circumference = " + C);        
 System.out.println ("Diameter = " + D);   
 System.out.println ("Area = " + A);   
}

}