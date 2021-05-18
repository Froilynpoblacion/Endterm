import javax.swing.JOptionPane;

public class Test
{
	public static void main(String[] args)
	{
		Checking Account = new Checking(1);
		Savings  Savings = new Savings(0, 0);
		
		JOptionPane.showMessageDialog(null, Account.getAccountInfo());
		JOptionPane.showMessageDialog(null, Savings.getAccountInfo());
	}
}