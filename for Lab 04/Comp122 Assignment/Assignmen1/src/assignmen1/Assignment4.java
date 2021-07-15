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
public class Assignment4 {
    
    public static void main(String[] args){
 
Scanner input = new Scanner(System.in);
  
int number;
int a;

System.out.println ("Please enter a five digit number:");

number = input.nextInt();

 if(number >=10000 && number <100000)
 {
  System.out.println ("ok");
 
     int digit1 = number / 10000;
     int digit2 =(number % 10000)/1000;
     int digit3 =(number % 1000)/100;
     int digit4 =(number % 100)/10;
     int digit5 = number % 10;
        
        System.out.println(digit1+"\n\n\n");
       
        System.out.println(digit2);
        System.out.println ();
        System.out.println ();
        System.out.println();
        System.out.println(digit3);
        System.out.println ();
        System.out.println ();
        System.out.println();        
        System.out.println(digit4);
        System.out.println ();
        System.out.println ();
         System.out.println();        
        System.out.println(digit5);}
        
        else
 
        {System.out.println ("Please enter a five digit number and rerun:");
         }
 }

}
