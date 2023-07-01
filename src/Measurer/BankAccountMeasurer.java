package Measurer;
/**
 * Objects of this class measure bank account balances.
 */
public class BankAccountMeasurer implements Measurer, Filter
{
	public double measure(Object anObject)
	{
		BankAccount acct = (BankAccount) anObject;
		return acct.getBalance();
	}
	
	public boolean accept(Object x)
	{
		BankAccount acct = (BankAccount) x;
		if(acct.getBalance()>=1000) return true;
		else return false;
	}
}
