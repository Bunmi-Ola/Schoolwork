/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodassignment;

/**
 *
 * @author Favour
 */
public class Practice {
    
     public static void main(String[] args) {
         
        int C, d;
        for (C =1; C <= 5; C++) {
            for (d = 5; d >= C; d--) {
                System.out.print(d+ " ");
            }
            System.out.println();
        }
        System.out.println();
        
        int a, b;
        for (a =1; a <= 5; a++) {
            for (b = 4; b >= a; b--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=a;j++){
             System.out.print(j+" ");
        }
            System.out.println();
     }
}
}
