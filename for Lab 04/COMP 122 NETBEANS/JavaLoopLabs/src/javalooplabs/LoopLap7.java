/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalooplabs;

/**
 *
 * @author olanrewaju4401
 */
public class LoopLap7 {
    
    public static void main(String[] args){
        
        int num = 1, min = 6;    
        for (int i= 1; i <=6; i++){
            System.out.println();
            for (int j = 1; j<=5;j++){
             System.out.print(1);
           
            }
            System.out.println();
         //https://www.youtube.com/watch?v=5TIUbp9_xvM
         //https://javaconceptoftheday.com/number-pattern-programs-in-java/
        }
        
        for (int i = 6; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        
        for (int i = 1; i <= 6; i++)
        {
            for (int j = 6; j >= i; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        
        
        for (int i = 6; i >= 1; i--)
        {
            for (int j = 6; j >= i; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
    }
}