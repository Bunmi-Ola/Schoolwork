/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectassignment;
import java.util.Scanner;
/**
 *
 * @author olanrewaju4401
 */
public class ChangeMachine {
    private int loonies;
    private int toonies;
    private boolean status;

    Scanner input = new Scanner(System.in);
    
    
    public String toString(){
        
        String Change = "Number of loonies: "+ getLoonies() +"\n";
        Change+= "Number of Toonies: "+ getToonies() +"\n";
            
        return Change;
    }
    
    public ChangeMachine (int loonies, int toonies  ) {
        
        setToonies(toonies);
        setLoonies(loonies);
                 
        this.loonies = loonies;
        this.toonies = toonies;        
        
    } 
   
    public int getLoonies() {
        return loonies;
    }

    
    public void setLoonies(int loonies) {
       if(loonies<0){
            System.out.println( "You cannot have a negative number of coins!"  );    
        }
        else{           
            this.loonies = loonies;            
        }
    }  
    
    public int getToonies() {
        return toonies;
    }

   
    public void setToonies(int toonies) {
        if(toonies<0){
            System.out.println( "You cannot have a negative number of coins!"  );    
        }
        else{           
            this.toonies = toonies;            
        }
    }

    public boolean isStatus() {
        
        return status;
    }

  
    public void setStatus(boolean status) {
        
        this.status = status;
    }
    
     public void acceptMoney(int amount) {
         
         checkStatus( ); 
        
         if (amount == 5 ||amount == 10 || amount == 20){
          makeChange(amount);
         }
         else {      
          System.out.println( "You must insert a $5 or $10 or $20 bill. " );
         }  
    }
     
     public void checkStatus( ) {
        
         if(loonies>=1 && toonies>=10){
             status = true;
             System.out.println( "Enough coins to dispense");
         }
         else{
             status = false;
            System.out.println( "Out of Order! Here is your bill back, there aren’t enough coins and the machine needs refilling " );
         }

     }
      
     public void makeChange(int amount) {
        if (toonies*2+ loonies > amount ){
       
         if(amount == 20){
             toonies=toonies-10;
             System.out.println("10 toonies dispensed");            
         }
         if(amount == 10){
             toonies=toonies-5;
             System.out.println("5 toonies dispensed");            
         }
         if(amount == 5){
             toonies=toonies-2;
             loonies=loonies-1;
             System.out.println("2 toonies and 1 loonies dispensed");     
         }
         }
         
      }  
}
