/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysassignment;

/**
 *
 * @author olanrewaju4401
 */
public class StudentGradesProject {
    
    public static void main(String[] args) {
        
        String [] name = {"Robin", "Jo", "Kelly", "Jaimie"};
        int [] midtermScore = {28, 78, 92, 83};
        int [] finalScore = {58, 75, 96, 79};
        int [] assignmentGrade = {33, 80, 90, 83};
        
        String [] newname = {"Robin", "Jo", "Kelly", "Jaimie", "Terry", "Kerry"};
        int [] newmidtermScore = {28, 78, 92, 83, 86, 71};
        int [] newfinalScore = {58, 75, 96, 79, 76, 75};
        int [] newassignmentGrade = {33, 80, 90, 83, 91, 78};
        
        
        
        int []FinalGrade = ArrayassignmentMethod.getFinalGrades( midtermScore, finalScore, assignmentGrade, 4);
        System.out.println("Name \t" + "Mid-Term Score\t" + "Final Score\t" + "Assignment Grade\t" + "Final Grade\t");
        
        for (int i = 0; i< name.length; i++){ 
        System.out.println(name[i]+"\t\t"+midtermScore[i] +"\t" + finalScore[i] +"\t\t" +assignmentGrade[i] + "\t\t\t" + FinalGrade[i]);
        }
        
        int sumofFinalGrade = 0;
        int AverageofFinalGrade = 0;
        
        for (int i = 0; i< FinalGrade.length; i++){ 
            
            sumofFinalGrade += FinalGrade[i];
        }
        AverageofFinalGrade = sumofFinalGrade/FinalGrade.length;
        System.out.println("Average of all the final grades is " + AverageofFinalGrade);
        
        System.out.println("\n");
    
        int []newFinalGrade = ArrayassignmentMethod.getFinalGrades(newmidtermScore, newfinalScore, newassignmentGrade, 6);
        System.out.println("Name \t" + "Mid-Term Score\t" + "Final Score\t" + "Assignment Grade\t" + "Final Grade\t");
        
        for (int i = 0; i< newname.length; i++){ 
        System.out.println(newname[i]+"\t\t"+newmidtermScore[i] +"\t" + newfinalScore[i] +"\t\t" + newassignmentGrade[i] + "\t\t\t" + newFinalGrade[i]);
        }
        
        int newsumofFinalGrade = 0;
        int newAverageofFinalGrade = 0;
        
        for (int i = 0; i< newFinalGrade.length; i++){ 
            
            newsumofFinalGrade += newFinalGrade[i];
        }
        newAverageofFinalGrade = newsumofFinalGrade/newFinalGrade.length;
        System.out.println("Average of all the final grades is " + newAverageofFinalGrade);
        
        int lowestscore = 100; int higestscore = 0;
        String highestScoreName = ""; String lowestScoreName = "";
        for (int i=0; i<newFinalGrade.length; i++){
            
            if (lowestscore > newFinalGrade[i]){
                lowestscore = newFinalGrade[i];
                lowestScoreName = newname[i];         
              }            
             
            if (higestscore < newFinalGrade[i]){
                higestscore = newFinalGrade[i];
                highestScoreName = newname[i];         
              }         
       }
        System.out.println("\n");
        System.out.println("Lowest Score is  " + lowestscore + "\n Student with the lowest Score is  " + lowestScoreName  );             
        System.out.println("Highest Score is  " + higestscore + "\n Student with the highest Score is  " + highestScoreName  );     
        
        System.out.println("\n");
        int scoreAbove60 = ArrayassignmentMethod.findFrequency(newFinalGrade, 60);
        System.out.println("The number of students whose overall final grade is 60% or higher is " + scoreAbove60  ); 
    }
}
