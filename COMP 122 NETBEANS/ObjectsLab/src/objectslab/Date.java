/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectslab;

import java.util.Scanner;

/**
 *
 * @author Favour
 */
public class Date {
    
    private int month;
    private int day;
    private int year;

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    public Date (int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
        
    public String displayDate(){
        
        String d = month+"/";
        d+= day +"/";
        d+= year ;       
        
        return d;
    }
    
     public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         
         Date DefaultDate = new Date (01, 01, 2018);
         System.out.println("Default Date is: "+ DefaultDate.displayDate());
        
        System.out.print ("Please enter the day: "); 
        int day = input.nextInt();
        System.out.print ("Please enter the month: ");
        int month = input.nextInt();
        System.out.print ("Please enter the year: ");
        int year = input.nextInt();
        
        Date NewDate = new Date (month, day, year);
        System.out.println("The Date is: "+ NewDate.displayDate());
                 
     }
    
}
