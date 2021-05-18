abstract class Account
{
	protected int AccountNumber;
	protected double bal;
	
	public Account(int acc)
	{
		AccountNumber = acc;
		setBalance(0.0);
	}
	
	public void setBalance(double b)
	{
		bal = b;
	}
	
	public abstract int getAccountNumber();
	public abstract double getBalance();
	
	
	public abstract String getAccountInfo();
}