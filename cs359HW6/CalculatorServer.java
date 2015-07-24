package cs359HW6;
 
import java.rmi.Naming;

public class CalculatorServer {

   public CalculatorServer() {
     try {
       Auctioneer c = new AuctioneerImpl();
       Naming.rebind("rmi://localhost:1099/CalculatorService", c);
		 //Naming.rebind("rmi://136.167.243.63:1099/CalculatorService", c);
     } catch (Exception e) {
       System.out.println("Trouble: " + e);
     }
   }

   public static void main(String args[]) {
     new CalculatorServer();
   }
}


