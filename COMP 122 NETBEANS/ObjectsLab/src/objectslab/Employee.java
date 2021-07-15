/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectslab;

/**
 *
 * @author Favour
 */
public class Employee {
    
     private String firstName;
     private String lastName;
     private double monthlysalary;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the monthly salary
     */
    public double getMonthlysalary() {
        return monthlysalary;
    }

    /**
     * @param monthlysalary the monthly salary to set
     */
    public void setMonthlysalary(double monthlysalary) {
        if (monthlysalary < 0) {
            this.monthlysalary = 0;
        }
        else
        this.monthlysalary = monthlysalary;
    }
    public double computeyearlysalary( ) {
        
      return  monthlysalary * 12; 
    }
    
     public Employee (String firstName, String lastName, double monthlysalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlysalary = monthlysalary;
    }
    
    public String toString(){
        
        String E = "First Name: "+ firstName+"\n";
        E+= "Last Name: "+ lastName +"\n";
        E+= "Monthly salary: "+ monthlysalary +"\n";        
        E+= "Yearly salary:"+ computeyearlysalary();       
        
        return E;
    }
    
    public static void main(String[] args) {
        
        String firstname = "Ola";
        String lastname = "Pat";
        double monthlysalary1 = 3500;
        
        Employee employee1 = new Employee(firstname, lastname, monthlysalary1);
        System.out.println("First Employee details include \n"+ employee1.toString());
        System.out.println("10 percent raise on 1st employee yearly salary is "+ (employee1.computeyearlysalary()*1.10));
        
        firstname = "rake";
        lastname = "Brian";
        double monthlysalary2 = 1253.89;
        Employee employee2 = new Employee(firstname, lastname, monthlysalary2);
        System.out.println("Second Employee details include \n"+ employee2.toString());
        System.out.println("10 percent raise on 2nd employee yearly salary is "+ (employee2.computeyearlysalary()*1.10));
    }
}

