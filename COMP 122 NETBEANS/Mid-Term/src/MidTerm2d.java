


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olanrewaju4401
 */
public class MidTerm2d {
     public static void main(String[] args) {
                 
         int Grade;          
         int numgrades; 
         int TotalMarks = 100;
         int a=0, b=0, c=0, d=0, f=0;
         char Output='m';
         System.out.print("How many grades, ");
         
         numgrades = MidTerm2a.getValidInput(1, 30, "You must enter a number between 1 and 30, please re-enter");
                
         for (int i=0; i <numgrades; i++){             
             System.out.print("Eneter individual grade, ");
                   
             Grade = MidTerm2a.getValidInput(0, 100, "You must enter a number between 0 and 100, please re-enter");
           
            Output = MidTerm2b.calculateLetterGrade(Grade, TotalMarks); 
           
           if (Output == 'A') { a++;}   
           if (Output == 'B') { b++;}    
           if (Output == 'C') { c++;}     
           if (Output == 'D') { d++;}
           if (Output == 'F') { f++;}    
     }    
           System.out.println("A: " + a);
           System.out.println("B: " + b);
           System.out.println("C: " + c);
           System.out.println("D: " + d);
           System.out.println("F: " + f);
           System.out.println( );          
           
          MidTerm2c.showGradeDistribution (a, b, c, d, f);
     }
    
}
