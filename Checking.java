public class Checking extends Account
{
	public Checking(int accountNumber)
	{
		super(accountNumber);
	}
	
	public int getAccountNumber()
	{
		return AccountNumber;
	}
	
	public double getBalance()
	{
		return bal;
	}
	
	public String getAccountInfo()
	{
		return("AccountNumber: " + getAccountNumber() + "\nBalance: " + getBalance());
	}
}