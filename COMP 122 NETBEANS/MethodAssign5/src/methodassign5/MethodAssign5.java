/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodassign5;

import java.util.Scanner;

/**
 *
 * @author Favour
 */
public class MethodAssign5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        
        double GeneralIncome, InvestmentIncome, OtherIncome, RegularDeduction, OtherDeduction;
        System.out.println("Please enter you General Income:  " );
        GeneralIncome = input.nextDouble(); 
        
        System.out.println("Please enter you InvestmentIncome:  " );
        InvestmentIncome = input.nextDouble(); 
        
        System.out.println("Please enter you Other Income:  " );
        OtherIncome = input.nextDouble();
        
        System.out.println("Please enter you RegularDeduction:  " );
        RegularDeduction = input.nextDouble();
        
        System.out.println("Please enter you OtherDeduction:  " );
        OtherDeduction = input.nextDouble();
        
        double taxplayerTaxableIncome = calculateTaxableIncome(GeneralIncome, InvestmentIncome, OtherIncome, RegularDeduction, OtherDeduction);
        System.out.printf("Amount of Taxable income is  $%.2f\n", taxplayerTaxableIncome);
        
        double IncomeTax = calculateIncomeTax(taxplayerTaxableIncome);
        System.out.printf("Income Tax due to the Government is  $%.2f\n", IncomeTax);
        
        double paidTax;
        System.out.println("Please enter Tax paid perviously  " );
        paidTax = input.nextDouble();
        
        double Taxbalance = (IncomeTax - paidTax);
        if (Taxbalance>=0){
            System.out.printf("Income tax still owned is $%.2f\n", Taxbalance  );
        }
        else{
           System.out.printf("You have a return of $%.2f\n", (Taxbalance*-1) ); 
        }
    }
     public static double calculateTaxableIncome (double generalIncome, double investmentIncome, double otherIncome, double regularDeduction, double otherDeduction) {

         double taxableIncome = (generalIncome +investmentIncome +otherIncome)-(regularDeduction+(0.5*otherDeduction));
         return taxableIncome;
     }
     
     public static double calculateIncomeTax (double taxableIncome){
     double tax=0;
     
     if (taxableIncome <=20000){
         tax = 0.10 * taxableIncome;         
     }
     
     if (taxableIncome >20000 && taxableIncome <=40000){
         tax = (0.10 * 20000) +(0.12*(taxableIncome - 20000));         
     }
     
     if (taxableIncome >40000 && taxableIncome <=60000){
         tax = (0.10 * 20000) +(0.12 * 20000) + (0.15*(taxableIncome - 40000));         
     }
     
     if (taxableIncome >60000){
         tax = (0.10 * 20000) +(0.12 * 20000) +(0.15 * 20000)+ (0.20*(taxableIncome - 60000));         
     }
     
     return Math.round(tax*100)/100;
     }
}
