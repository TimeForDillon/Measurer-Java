package Measurer;
/**
 * A class that represents a bank account.
 */
public class BankAccount
{
	private double accountBalance;
	
	/**
	 * Constructs a bank account and sets the balance to the given value.
	 * @param value
	 */
	public BankAccount(int value)
	{
		this.accountBalance = value;
	}
	
	/**
	 * Retrieves the balance within the bank account.
	 * @return The balance within the bank account.
	 */
	public double getBalance()
	{
		return this.accountBalance;
	}
}
