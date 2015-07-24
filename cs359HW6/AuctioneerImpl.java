package cs359HW6;
 
public class AuctioneerImpl 
    extends 
      java.rmi.server.UnicastRemoteObject 
    implements Auctioneer { 
 
    // Implementations must have an 
    //explicit constructor 
    // in order to declare the 
    //RemoteException exception 
    public AuctioneerImpl() 
        throws java.rmi.RemoteException { 
        super(); 
    } 
 
    public long add(long a, long b) 
        throws java.rmi.RemoteException { 
        System.out.println ("Adding " + a + " and " + b);
        return a + b; 
    } 
 
    public long sub(long a, long b) 
        throws java.rmi.RemoteException { 
        System.out.println ("Subtracting " + b + " from " + a);
        return a - b; 
    } 
 
    public long mul(long a, long b) 
        throws java.rmi.RemoteException { 
        System.out.println ("Multiplying " + a + " by " + b);
        return a * b; 
    } 
 
    public long div(long a, long b) 
        throws java.rmi.RemoteException { 
        System.out.println ("Dividing " + a + " by " + b);
        return a / b; 
    } 
} 

