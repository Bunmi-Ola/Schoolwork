/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectassignment;


/**
 *
 * @author olanrewaju4401
 */
public class TestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numberofAccounts = Account.getNumberOfAccounts();
     
        System.out.println("Number of accounts created is: " + numberofAccounts);
         Account firstAccount = new Account(2000, 0.02);
         Account SecondAccount = new Account(500, 0.02);
         
         
        System.out.println("Account Number " +  firstAccount.getId() +" has initial balance of $" + firstAccount.getBalance());
               
        System.out.println("Account Number " +  SecondAccount.getId() +" has initial balance of $" + SecondAccount.getBalance());
        
        firstAccount.transfer(500, SecondAccount );
        
        System.out.println("\nNew balance after the transfer ");        
        System.out.println("Account Number " +  firstAccount.getId() +" has new balance of $" + firstAccount.getBalance());               
        System.out.println("Account Number " +  SecondAccount.getId() +" has new balance of $" + SecondAccount.getBalance());

        firstAccount.deposit(1500);
        System.out.println("New Balance 0f Account " +  firstAccount.getId() +" after deposit is $" + firstAccount.getBalance()); 
        
        numberofAccounts = Account.getNumberOfAccounts();        
        System.out.println("Number of accounts created is: " + numberofAccounts);    
         
         
        
        
    }
    
}
