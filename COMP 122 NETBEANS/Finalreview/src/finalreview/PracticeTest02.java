/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalreview;

/**
 *
 * @author olanrewaju4401
 */
public class PracticeTest02 {
    
    public static void main(String[] args) {
        
        int Midterm = 78;
        int finalscore = 83;
        int assignment = 82;
        
        Student Student1 = new Student(8888, "Gerry", Midterm, finalscore, assignment);
        System.out.println("First Studuent details include \n"+ Student1.toString());
        double FinalGrade = Student1.getFinalGrade();
        
        System.out.println("Final Grade is "+ FinalGrade);
        
        FinalGrade = 1.1 * FinalGrade;
        System.out.println("Final Grade is "+ FinalGrade);
    }
    
}
