//Savannah Muniz

public class BankAccount {

	protected double balance;
	protected static int numAccounts = 0;
	
	public BankAccount() throws NegativeStartingBalance{
		this.balance = 0;
		numAccounts++;
	}
	public BankAccount(double balance) throws NegativeStartingBalance{
		if (balance >= 0){
			this.balance = balance;
			numAccounts++;
		}else throw new NegativeStartingBalance(balance);
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double deposit){
		balance = balance + deposit;
	}
	public void withdraw(double withdraw){
		balance = balance - withdraw;
	}
	public static int getNumAccounts(){
		return numAccounts;
	}
}
