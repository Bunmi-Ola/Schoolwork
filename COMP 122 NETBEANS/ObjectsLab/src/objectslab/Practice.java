/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectslab;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class Practice {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print ("Please enter the radius:");
        Circle Circle1 = new Circle (input.nextInt());  
       
        
        Circle Circle2 = new Circle ();        
        Circle2.setRadius(5);
        
        Circle circle3 = new Circle(4);
        
        double area1 = Circle1.computeArea();
        double area2 = Circle2.computeArea();
        
        System.out.println("Area 1: "+ area1);
        System.out.println("Area 2: "+ area2);
        System.out.println("Area 3: "+ circle3.computeArea());
        System.out.println("Circumference of Circle 1 : "+ Circle1.computeCircumference( ));
        System.out.println("Circumference of Circle 2 : "+ Circle2.computeCircumference( ));
        System.out.println("Circumference of Circle 3 : "+ circle3.computeCircumference( ));
         System.out.println();
        
         
        Rectangle Rectangle1 = new Rectangle (4, 5);
        System.out.println("perimeter of  Rectangle1: "+ Rectangle1.computeperimeter( ));
        
        
    }
}
 