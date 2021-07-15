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
public class LoopLap1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
       
        int numumberOfStudents = 10;
        
       String StudentName= "";
         
        int highestScore = 0;
        
        String highestScoreName = "";
               
        System.out.print("Enter the name of students and scores: ");
                      
         for (int i=0; i<numumberOfStudents; i++){
             
            System.out.print("Student" + (i + 1) +"\n   Name: " );
        
            StudentName = input.next();
            
            System.out.print("Scores: ");
            
            int Scores = input.nextInt(); 
            
            if (highestScore < Scores){
                highestScore = Scores;
                highestScoreName = StudentName;
                
                
            }            
      
         }
                     
        System.out.print("Highest mark is  " + highestScore + "\n Student with the highest Score is  " + highestScoreName  );        
        
      
       
       
    }
        
    
}
