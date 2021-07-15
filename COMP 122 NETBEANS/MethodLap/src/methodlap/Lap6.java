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
public class Lap6 {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        
        double dia;
        System.out.println("Enter the diameter: " );
        dia = input.nextDouble();
        double cireclearea = 0.25*(3.14159)*dia*dia;
        System.out.println("The area is of circle is : " + cireclearea);
        
        double width;
        System.out.println("Enter the width: " );
        width = input.nextDouble();
        
        double length;
        System.out.println("Enter the length: " );
        length = input.nextDouble();
        
        double arearec = width * length;
        System.out.println("The area is of rectangle is : " + arearec);
        
        double priceofroundpizza;
        System.out.println("Enter the price of round pizza: " );
        priceofroundpizza = input.nextDouble();
        double valueofroundpizza = priceofroundpizza/cireclearea;
        
        double priceofrectanglepizza;
        System.out.println("Enter the price of rectangle pizza: " );
        priceofrectanglepizza = input.nextDouble();
        double valueofrectanglepizza = priceofrectanglepizza/arearec;
        
      
        if (valueofroundpizza > valueofrectanglepizza){
           
            System.out.println("Better value is: "+ valueofroundpizza);
            System.out.println("The Rectangel pizza have the better value");
         
        }
        
        else {
             System.out.println("Better value is: "+ valueofrectanglepizza);
            System.out.println("The Round pizza have the better value");
    }
        
        
}
}