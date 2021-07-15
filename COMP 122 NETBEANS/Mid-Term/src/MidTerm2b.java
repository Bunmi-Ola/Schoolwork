
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
public class MidTerm2b {
    
     public static void main(String[] args) {
         
        Scanner input = new Scanner (System.in);
        
         int Grade, TotalMarks;
         
          System.out.print("Please eneter the grade: ");
                Grade = input.nextInt();  
          
          System.out.print("Please eneter the total marks: ");
              TotalMarks= input.nextInt();  
         
         char output = calculateLetterGrade(Grade, TotalMarks);
         System.out.println ( "Letter Grade is " + output );
    
     }
     public static char calculateLetterGrade (int grade, int totalMarks) {
      
         char letterGrade= 'A';
        Double gradeValue = Double.valueOf(grade);
        Double totalMarksValue = Double.valueOf(totalMarks);
        double percentage = (gradeValue/totalMarksValue)*100;
         
        if (percentage >= 0 && percentage <= 50){
         letterGrade = 'F' ;
        }
         
        else if (percentage > 50 && percentage <= 60){
        letterGrade = 'D' ;
        }
         
        else if (percentage > 60 && percentage <= 70){
        letterGrade = 'C' ;
        }
       
        else if (percentage > 70 && percentage <= 80){
        letterGrade = 'B' ;
        }
        
        else if (percentage > 80 && percentage <= 100){
        letterGrade = 'A' ;
        }
        
        return letterGrade;
     }
     
}

