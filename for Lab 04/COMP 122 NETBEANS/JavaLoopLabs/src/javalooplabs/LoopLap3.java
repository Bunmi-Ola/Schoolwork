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
public class LoopLap3 {
    public static void main(String[] args) {
         
         Scanner input = new Scanner (System.in);
         
         int numumberOfStudents =0;
        
         int Score = 0; 
        
        String StudentName= "";
         
        int highestScore = 0;
        
        String highestScoreName = "";
               
        
                
        while(Score !=-1){
        
            System.out.print("Enter the name of students and scores: ");
            System.out.print("Student" + (numumberOfStudents + 1) +"\n   Name: " );
            StudentName = input.next();
            
            System.out.print("Scores: (-1 to exit)");
            Score = input.nextInt();
            numumberOfStudents++;
            
                     
            
            
            if (highestScore < Score){
                highestScore = Score;
                highestScoreName = StudentName;               
                
            }            
      
         }
                     
        System.out.print("Name and Score of the student with the highest grade is " + highestScoreName + "\n" + highestScore);          
              
       
    }
        
       

}
