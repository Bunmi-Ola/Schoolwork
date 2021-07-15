/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class Lab4 {
     public static void main(String[] args){
         
         int a, b, c;
         
Scanner keyboard = new Scanner(System.in);

System.out.print ("Lenght of the first side: ");
    a = keyboard.nextInt();

System.out.print ("Lenght of the Second side: ");
    b = keyboard.nextInt();
    
System.out.print ("Lenght of the third side: ");

    c = keyboard.nextInt();
    {   
if ((a+b)> c)
{ 
        if ((a+c)>b)
        {
            if ((b+c)>a)
            {  
                System.out.println("The Triangle is a valid Triangle");
            }
        
        else
        {
            System.out.println("The Triangle is an invalid Triangle");
        }
}
        else
        {
            System.out.println("The Triangle is an invalid Triangle");
                }
}
        else
        {
                    
       System.out.println("The Triangle is an invalid Triangle");
                    }  
                
        }
     }
    
}
