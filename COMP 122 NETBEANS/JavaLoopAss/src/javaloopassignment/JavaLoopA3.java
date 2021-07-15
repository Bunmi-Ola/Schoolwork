/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloopassignment;

import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class JavaLoopA3 {
 
    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);
       
        int numumberOfStudents = 10;
        
       String StudentName= "";
       
        int Scores;
         
        int Success = 0;
        
        int Failure = 0;
               
        System.out.print("Enter the name of students and scores: ");
                      
         for (int i=0; i<numumberOfStudents; i++){
             
            System.out.print("Student" + (i + 1) +"\n   Name: " );
        
            StudentName = input.next();
            
            System.out.print("Scores: ");
            Scores = input.nextInt(); 
            
            while (Scores <0 || Scores > 100){
          System.out.print("Invalid input. Please reenter: ");
          Scores = input.nextInt(); 
          }
            
            if (Scores >= 50){
              System.out.println("passed");
              Success++; 
            }
              
              else{
                 System.out.println("failed");
                 Failure++; 
            }    
             
         }   
        System.out.println("Number of students that passed is " + Success);
               
           
        System.out.println("Number of students that failed is " + Failure);
                
    }                
    
}
