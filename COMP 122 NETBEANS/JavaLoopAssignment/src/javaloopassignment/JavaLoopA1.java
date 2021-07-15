/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloopassignment;
import java.util.Scanner;

/**
 *
 * @author olanrewaju4401
 */
public class JavaLoopA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner (System.in);
        int i = 1, number, largest = 0;
         
        while (i <= 10) {
            System.out.printf("Insert number" + i + "\t\t");
            number = input.nextInt();
                if (number > largest) {
                    largest = number;
                }
            i++;
        }
         
        System.out.printf("The largest number is: " + largest);
    }
}
        
       
  
