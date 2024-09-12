
package patenio.it2b;

import java.util.Scanner;


public class Hotel {
     public void getInfo(){
         
      
    
    Scanner sc=new Scanner (System.in);
    Hotels [] hl= new Hotels[100];
    
        System.out.print("Enter number of bookings: ");
        int nums=sc.nextInt();
        
         for (int i=0; i<nums; i++){
             System.out.print("Booking ID: ");
             int fid=sc.nextInt();
             
             System.out.print("Guest Name: ");
             String fname=sc.next();
             
             System.out.print("Room type: ");
             String room=sc.next();
             
             System.out.print("Check-in-Date: ");
             String fcin=sc.next();
             
             System.out.print("Check-out-Date: ");
             String fcout=sc.next();
             
             System.out.print("Payment Status: ");
             String fpstatus=sc.next();
             
             System.out.print("Status: ");
             String fstatus=sc.next();
           
           hl[i] = new Hotels();
           hl[i].AddInfo(fid, fname, room, fcin, fcout, fpstatus, fstatus);
           
           
       }
          for(int i = 0; i < nums; i++){
            hl[i].viewDetails();
             System.out.println("Number of Bookings: "+nums);
   }
   }
}