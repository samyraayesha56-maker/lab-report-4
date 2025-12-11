class BankAccount {
	private int AccountNumber;
	private String accountHolderName;
	private int balance;
	
	
	public void setAccountNumber(int AccountNumber) {
		this.AccountNumber=AccountNumber;
	}


	public void setaccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}
	
	
	public void setbalance(int balance) {
		if(balance<0)
		{
			System.out.println("Invalid Balance");
		}
		else {
			this.balance=balance;
		}
	}
	
	
	public String getsetaccountHolderName()
	{
		return accountHolderName;
	}
	public int getAccountNumber()
	{
		return AccountNumber;
	}
	public int getbalance()
	{
		return balance;
	}

	
	public void Display() {
		System.out.println(AccountNumber);
		System.out.println(accountHolderName);
		System.out.println(balance);
	}

}
public class Main
{
	public static void main(String[] args) {
		BankAccount bankAccount1 =new BankAccount();
		BankAccount bankAccount2 =new BankAccount();
		BankAccount bankAccount3 =new BankAccount();
		bankAccount1.setaccountHolderName("Antor");
		bankAccount2.setaccountHolderName("Ayesha");
		bankAccount3.setaccountHolderName("Rony");
		bankAccount1.setAccountNumber(242002174);
		bankAccount2.setAccountNumber(242002175);
		bankAccount3.setAccountNumber(242002176);
		bankAccount1.setbalance(5000);
		bankAccount1.setbalance(-5000);
		System.out.println(bankAccount1.getbalance());
		bankAccount2.setbalance(500000);
		bankAccount3.setbalance(5000000);
		
		System.out.println();
		bankAccount1.Display();
		System.out.println();
		bankAccount2.Display();
		System.out.println();
		bankAccount3.Display();
	

	}
}