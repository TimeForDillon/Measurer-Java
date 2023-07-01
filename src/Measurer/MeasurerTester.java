package Measurer;
import java.awt.Rectangle;

/**
   This program demonstrates the use of a Measurer.
*/
public class MeasurerTester
{
   public static void main(String[] args)
   {
      Measurer areaMeas = new AreaMeasurer();
      Measurer bankAve = new BankAccountMeasurer();
      Filter bankFilter = new BankAccountMeasurer();

      Rectangle[] rects = new Rectangle[] 
	          {
	             new Rectangle(5, 10, 20, 30),
	             new Rectangle(10, 20, 30, 40),
	             new Rectangle(20, 30, 5, 15)
	          };
      
      BankAccount[] accts = new BankAccount[]
    		  {
    			 new BankAccount(2000),
    			 new BankAccount(0),
    			 new BankAccount(1000),
    			 new BankAccount(1500)
    		  };

      double averageArea = Data.average(rects, areaMeas);
      double averageBank = Data.filterAvg(accts, bankAve, bankFilter);
      
      System.out.println("Average area: " + averageArea);
      System.out.println("Expected: 625\r");
      
      System.out.println("Average bank account balance (over $1000): " + averageBank);
      System.out.println("Expected: 1500");
   }
}

/*
Average area: 625.0
Expected: 625

Average bank account balance (over $1000): 1500.0
Expected: 1500
*/