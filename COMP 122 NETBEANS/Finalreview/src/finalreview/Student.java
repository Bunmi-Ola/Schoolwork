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
public class Student {
    
    private int id;
     private String name;
     private int midterm;
     private int Final;
     private int assignment;

    /**
     * @return the id
     */
    
   public Student() {}
    
    @Override  //optional
    public String toString(){
        
        String Student = "ID: "+id+"\n";
        Student+= "Name: "+ name +"\n";
        Student+= "Mid-Term: "+midterm+"\n";  
        Student+= "Final: "+Final+"\n";  
        Student+= "Assignment: "+assignment+"\n";  
       
        return Student;
    }
    
    public Student (int id, String name, int midterm, int Final, int assignment) {
        this.id = id;
        this.name = name;
        this.midterm = midterm;
        this.Final = Final;
        this.assignment = assignment;
    }
    
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the midterm
     */
    public int getMidterm() {
        return midterm;
    }

    /**
     * @param midterm the midterm to set
     */
    public void setMidterm(int midterm) {
        if(midterm < 0){
            System.out.println( "Can’t use negative values"  );    
        }
        this.midterm = midterm;
    }

    /**
     * @return the Final
     */
    public int getFinal() {
        return Final;
    }

    /**
     * @param Final the Final to set
     */
    public void setFinal(int Final) {
        if (Final < 0){
         System.out.println( "Can’t use negative values"  );  
        }
        else this.Final = Final;
    }

    /**
     * @return the assignment
     */
    public int getAssignment() {
        return assignment;
    }

    /**
     * @param assignment the assignment to set
     */
    public void setAssignment(int assignment) {
         if(assignment < 0){
            System.out.println( "Can’t use negative values"  );    
        }
        else this.assignment = assignment;
    }
    
     public double getFinalGrade() {
        
       return (.2 * assignment) + (.35 * midterm) + (.45 * Final); 
    }
}
