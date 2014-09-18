
public class InsufficientFundsExceptionClass extends Exception {
	
	   private double amount;
	   /**
	    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
	    * @param amount
	    */
	   public InsufficientFundsExceptionClass(double amount)
	   {
	      this.amount = amount;
	   } 
	   public double getAmount()
	   {
	      return amount;
	   }
	}


