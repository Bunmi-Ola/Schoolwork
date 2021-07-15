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
public class TestShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print ("Please enter the radius: ");
        int radius = input.nextInt();
        Circle circle = new Circle (radius);  
        
       
        Rectangle Rec = new Rectangle ();
        Rec.setHeight(Math.random()* 10);
        Rec.setWidth(Math.random()* 10);
              
        double circlearea = circle.computeArea();
        double circlecir = circle.computeCircumference( );
        System.out.println("Circle Area: "+ circlearea);         
        System.out.println("Circumference of Circle is : "+ circlecir );
        
        System.out.println();               
        
        double recarea = Rec.computearea( ); 
        double recperimeter = Rec.computeperimeter( );
        System.out.println("perimeter of  Rectangle: "+ recperimeter);
        System.out.println("Area of  Rectangle: "+ recarea);
        
        double highestarea = 0;
        
        if (circlearea > recarea){
            highestarea = circlearea;
        }
        else 
        highestarea = recarea;
        
        System.out.println();   
        System.out.println("The highest area is : "+ highestarea);
        
        double highestcirOrPer;
        if (circlecir > recperimeter){
            highestcirOrPer = circlecir;
        }
        else 
        highestcirOrPer = recperimeter;
        
        System.out.println();   
        System.out.println("The highest circumference/perimeter is : "+ highestcirOrPer);
        
        System.out.print ("Please enter another radius: ");
        radius = input.nextInt();
        circle.setRadius(radius);
        
        circlearea = circle.computeArea();
        System.out.println("Circle Area: "+ circlearea);         
        
        System.out.println();   
        if (circlearea > recarea){
            highestarea = circlearea;
        }
        else 
        highestarea = recarea;
        
        System.out.println();   
        System.out.println("The highest area is : "+ highestarea);
    }
}
