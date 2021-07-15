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
public class Assignment5 {
     public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
   
        
        double weightInpounds;
        double heightInInches;
        
        
    System.out.println ("Please enter the weight in pounds :");    
    
     weightInpounds = input.nextInt(); 
    System.out.println ("Please enter the height in Inches :"); 
    
    
    heightInInches = input.nextInt(); 
    
    
    double bodymassindex = (weightInpounds * 703)/ (heightInInches * heightInInches);
    
    System.out.println ("bodymassindex :" + bodymassindex);
    
    if (bodymassindex < 18.5)
    
    {  
                System.out.println("Underweight");
            }
    else 
        if (bodymassindex >= 18.5 && bodymassindex <=24.9)
        
            {  
                System.out.println("Normal");
            }
        else 
            if (bodymassindex >= 25 && bodymassindex <=29.9)
        
            {  
                System.out.println("Overweight");
            }
            else 
                 if (bodymassindex >= 30)
        
            {  
                System.out.println("Obese:");
            }
}

}