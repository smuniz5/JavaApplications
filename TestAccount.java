//Savannah Muniz

public class TestAccount {

	public static void main(String[] args){
		
		try{
			BankAccount b1 = new BankAccount();
			BankAccount b2 = new BankAccount(1500.00);
			BankAccount b3 = new BankAccount(-1000);
		}catch(NegativeStartingBalance n){
			System.out.println(n);
		}
		System.out.println("Number of bank accounts created: "+BankAccount.getNumAccounts());
	}
}
