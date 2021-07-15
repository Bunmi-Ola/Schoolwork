
import java.util.Scanner;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olanrewaju4401
 */
public class Lab5 {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
      
      Random rand = new Random();
      
              
      int c = rand.nextInt(26)+65;
      int a = (int) (Math.random() *26)+65;      
     
      char b = (char) a;
      
      System.out.println("char " + b);
      
      char d = (char) c;
      
      System.out.println("Capital char " + d);
      
      int e = rand.nextInt(26)+97;
      
      char f = (char) e;
      
      System.out.println("Small char " + f);
        
    }
    
}
