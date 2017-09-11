//Savannah Muniz

public class LongDistanceBill extends PhoneBill{

	public LongDistanceBill(){
		
	}
	public LongDistanceBill(double monthlyRate, double callRate){
		setMonthlyRate(monthlyRate);
		setCallRate(callRate);
	}
	
	public double calculateBill(int time) {
		return (getCallRate() * (double)time) + getMonthlyRate();
	}
	
	

	
}
