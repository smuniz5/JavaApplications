//Savannah Muniz

public class NegativeStartingBalance extends Exception{
	
	protected double negBalance;
	
	public NegativeStartingBalance(){
		
	}
	public NegativeStartingBalance(double balance){
		super("Negative Starting Balance "+balance);
		negBalance = balance;
	}
}
