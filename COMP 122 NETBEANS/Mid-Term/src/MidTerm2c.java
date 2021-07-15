
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
public class MidTerm2c {
    
    public static void main(String[] args) {
         
        Scanner input = new Scanner (System.in);
              
        
        int A=1, B=2, C=3, D=4, F=5;
        
       showGradeDistribution (A, B, C, D, F);
          
    }
    
    public static void showGradeDistribution (int f, int d, int c, int b, int a) {
        
        String star = "*";
     
        System.out.print("A: ");
        for (int i = 0;  i<a; i++){           
                System.out.print(star );
        }
        System.out.println ( );
        System.out.print("B: ");
         for (int i = 0;  i<b; i++){           
                System.out.print(star );      
             }
         System.out.println ( );
         System.out.print("C: ");
         for (int i = 0;  i<c; i++){           
                System.out.print(star );      
             }
         System.out.println ( );
         System.out.print("D: ");
         for (int i = 0;  i<d; i++){           
                System.out.print(star);      
             }
         System.out.println ( );
         System.out.print("F: ");
         for (int i = 0;  i<f; i++){           
                System.out.print(star);      
             }
        }
        
     
}    
        
 
               
            
     

