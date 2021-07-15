/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olanrewaju4401
 */

//ALL JAVA CODE GOES INSIDE A CLASS
//The class has the same name as the file

import java.util.Scanner;

public class MyfirstJavaproram {
    
    //EVERY java program starts exceuting at the main method
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        //Declare a variable
        //Datatype and a name
        String name = "";
        
        //prompt the user for their name:
        System.out.println("please enter your name:");
        //Hang and wait for their name
        name = input.next();
                
        //PROCESSING
        String output = "Hello "+name;
        
        //OUTPUT        
        System.out.println(output);
    
    }
    
}



