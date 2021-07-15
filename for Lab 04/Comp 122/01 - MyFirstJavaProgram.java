/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gavin Osborne
 */

//All Java code goes inside a Class
//The class has the same name as the file

import java.util.Scanner;

public class MyFirstJavaProgram {
    
    //Every java program starts executing at the main method
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //Declare a variable
        //Datatype and a name
        String name = "";
        
        //prompt the user for their name:
        System.out.println("Please enter your name:");
        //Hang and wait for user input
        name = input.next();        
        
        System.out.println("Hello "+name);
        
    }
    
}
