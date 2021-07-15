
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olanrewaju4401
 */
public class MidTerm1b {
    
     public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int VehicleSpeed, posedSpeedLimit;
        double fine = 0;
        
        System.out.print("Please eneter the speed of the vehicle: ");
                VehicleSpeed = input.nextInt(); 
        
        System.out.print("Please eneter the Posted Speed Limit: ");
                posedSpeedLimit = input.nextInt(); 
       
        if (posedSpeedLimit > 40){
            
            if (VehicleSpeed - posedSpeedLimit <= 20){
                fine = 50 + (1* (VehicleSpeed - posedSpeedLimit));
            }

            if ((VehicleSpeed - posedSpeedLimit) > 20 && (VehicleSpeed - posedSpeedLimit) <40){
                fine = 50 + (1* 20)+ (5* ((VehicleSpeed - posedSpeedLimit)-20));
            }

            if ((VehicleSpeed - posedSpeedLimit)> 40){
                fine = 50 + (1* 20)+ (5* ((VehicleSpeed - posedSpeedLimit)-20))+(7* ((VehicleSpeed - posedSpeedLimit)-40));
            }
        }
        
        if (posedSpeedLimit == 40){
           if (VehicleSpeed - posedSpeedLimit <= 20){
                fine = (50 + (1* (VehicleSpeed - posedSpeedLimit)))*2;
            }

            if ((VehicleSpeed - posedSpeedLimit) > 20 && (VehicleSpeed - posedSpeedLimit) <40){
                fine = (50 + (1* 20)+ (5* ((VehicleSpeed - posedSpeedLimit)-20)))*2;
            }

            if ((VehicleSpeed - posedSpeedLimit)> 40){
                fine = (50 + (1* 20)+ (5* ((VehicleSpeed - posedSpeedLimit)-20))+(7* ((VehicleSpeed - posedSpeedLimit)-40)))*2;
            }
            
        }
        
        System.out.println ("Total fines: $" + fine);
        
        if (fine > 250){
            System.out.println ("Warning, dangerous driving");
        }
     } 
}
