/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslab;

/**
 *
 * @author Favour
 */
public class TestParallelArrays {
    
    public static void main(String[] args) {
        
        String [] product = {"CD", "DVD", "tape", "LP33", "USB", "floppy"};
        for (int i = 0; i< product.length; i++){
        System.out.print(product[i] + " ");}
        System.out.println();
        
        double [] price = {0.25, 1.89, 8.50, 138.75, 57.33, 1.22};
        for (int i = 0; i< price.length; i++){
        System.out.print(price[i] + " ");}
        System.out.println();
        
        int [] quantity = new int [6];        
        for (int i = 0; i< quantity.length; i++){            
            int r = (int) (Math.random()* 100+1);
            quantity [i] = r; 
        System.out.print(quantity[i] + " ");}
        System.out.println();
      
        double []roundtotal= new double [6];
        double [] total = new double [6];
        for (int i = 0; i< total.length; i++){
            total[i] = price[i]*quantity[i];
            roundtotal = ArrayMethods.round (total);
            System.out.print(roundtotal[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Product \t" + "Price\t" + "Quantity\t" + "Total\t");
        
        for (int i = 0; i< quantity.length; i++){ 
        System.out.println(product[i]+"\t\t"+price[i] +"\t" + quantity[i] +"\t\t" +roundtotal[i]);
        }
    }  
  
}

