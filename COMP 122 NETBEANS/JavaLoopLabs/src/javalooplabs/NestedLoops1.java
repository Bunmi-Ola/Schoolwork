/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalooplabs;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class NestedLoops1 {
    
    public static void main(String[] args){
         Scanner input = new Scanner (System.in);
        for (int i= 0; i <10; i++){
            
            System.out.println("Outer loop #" + i);
            for (int j = 0; j<10;j++){
                System.out.println(j +"");
            }
            
             System.out.print("\n");
            }
        
   
        int i, j, k = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j < i + 1; j++) {
                System.out.print(k++ + " ");
            }
 
            System.out.println();
        }
    
 
    int a, b;
        for (a = 1; a <= 5; a++) {
            for (b = 1; b < a + 1; b++) {
                System.out.print(b+ " ");
            }
           
            
         int Number;
        System.out.println("Enter a number " );
        Number = input.nextInt();
        
        for(int a = Number; a != 0; a /= 10) {
           
            System.out.println(a );
        }
}
    }
}