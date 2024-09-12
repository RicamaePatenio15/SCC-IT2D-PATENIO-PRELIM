
package patenio.it2b;


public class Hotels {
    String name, rtype, cin, cout, pstatus, status;
    int id;
    
    public void AddInfo(int fid, String fname, String room, String fcin,String fcout, String fpstatus, String fstatus){
    
    this.name= fname;
    this.rtype= room;
    this.cin= fcin;
    this.cout= fcout;
    this.id=fid;
    this.pstatus=fpstatus;
    this.status=fstatus;
    }
    public void viewDetails(){
    
       System.out.println("\n-----------------------------------");
       System.out.printf ("%-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s \n", "Booking ID", "Guest Name", "Room Type", "Check-in-Date", "Check-out-Date", "Payment Status", "Status");
        System.out.printf("%-10d | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s \n", this.id, this.name, this.rtype,this.cin, this.cout, this.pstatus, this.status);


    }
    
}

    
