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
public class Account {
     private int id;
     private double balance;
     private double annualInterestRate;
     private static int NumberOfAccounts;
     
    public Account() {}
    
    @Override  //optional
    public String toString(){
        
        String A = "Customer ID:"+ getId() +"\n";
        A+= "Balance:"+ getBalance() +"\n";
        A+= "Annual Interest Rate:"+ getAnnualInterestRate() +"\n";
        A+= "Monthly Interest Rate:"+ getMonthlyInterestRate() +"\n"; 
        return A;
    }
    
    public Account (double balance, double annualInterestRate ) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.id =1000+ NumberOfAccounts++;
        
        
    } 
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        if (balance < 0){
         this.balance = 0;   
        }
        else
        this.balance = balance;
    }

    /**
     * @return the annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * @param annualInterestRate the annualInterestRate to set
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
     
    public double getMonthlyInterestRate() {
        
      return  getAnnualInterestRate()/12; 
    }
    
    public double withdraw(double amount) {
        double amountwithdraw;
       if (amount < 0){ 
           amountwithdraw = 0;
       }
       else amountwithdraw = amount;
       
        if ( balance >= amountwithdraw )
            {
            setBalance(balance - amountwithdraw);
            }
            else
            {
            System.out.println( "Insufficient funds" );
            }        
      
      return  getBalance(); 
    }
    
    public double deposit(double amount) {
        double amountdeposit;
       if (amount < 0){ 
           amountdeposit = 0;           
       }
       else amountdeposit = amount;
        setBalance(getBalance() + amountdeposit);
      return  getBalance(); 
    }
         
    public void transfer(double amount, Account otherAccount) {
          if (amount <= balance) {
        withdraw(amount);
        otherAccount.deposit(amount);
        System.out.println("\nTransfer succesful. Tansfered: $" + amount + " To account Number " + otherAccount.id);
        } 
          else if (amount > balance) {
        System.out.println("\nTransfer failed, not enough balance!");
        }              
    }

    /**
     * @return the NumberOfAccounts
     */
    public static int getNumberOfAccounts() {
        int countnumberOfAccounts=0;       
        for(int i = 0; i<Account.NumberOfAccounts; i++){
            countnumberOfAccounts++;
        }
        
        return countnumberOfAccounts;
    }

}  