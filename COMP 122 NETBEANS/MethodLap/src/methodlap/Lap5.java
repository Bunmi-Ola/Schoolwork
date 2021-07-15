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
public class Lap5 {
    
     public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        
        double dia;
        System.out.println("Enter the diameter: " );
        dia = input.nextDouble();
        
        double cireclearea = areaofCircle(dia);
        System.out.println("The area is of circle is : " + cireclearea);
        System.out.println();
        
        double width;
        System.out.println("Enter the width: " );
        width = input.nextDouble();
        
        double length;
        System.out.println("Enter the length: " );
        length = input.nextDouble();
        
        double arearec = areaofrectangle(width,length);
        System.out.println("The area is of rectangle is : " + arearec);
        System.out.println();
        
        double priceofroundpizza;
        System.out.println("Enter the price of round pizza: " );
        priceofroundpizza = input.nextDouble();
        double valueofroundpizza = priceofroundpizza/cireclearea;
        
        double priceofrectanglepizza;
        System.out.println("Enter the price of rectangle pizza: " );
        priceofrectanglepizza = input.nextDouble();
        double valueofrectanglepizza = priceofrectanglepizza/arearec;
        
        double bettervalue = compare (valueofroundpizza,valueofrectanglepizza);
        String betterPizza = compareMessage(valueofroundpizza,valueofrectanglepizza);       
        
        System.out.println("Better value is: "+ bettervalue);
        System.out.println("The "+betterPizza+" pizza is the better value");
     }
    
     public static double areaofCircle(double d) {
        
        double area = 0.25*(3.14159)*d*d;
        
        return area;
        
    }
     
    public static double areaofrectangle(double w, double l) {
        
        double area = w*l;
        
        return area;
        
    }
    
    public static double compare(double round, double rectangle) {
        
       double bettervalue = round;
       if (rectangle > round)
           bettervalue = rectangle;       
        
        return bettervalue;
        
    }
    
    public static String compareMessage(double round, double rectangle) {
        
       String bettervalue = "round";
       if (rectangle > round)
           bettervalue = "rectangle";       
        
        return bettervalue;
        
    }
    
    
}
