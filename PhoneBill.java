//Savannah Muniz

public abstract class PhoneBill {

	private double monthlyRate;
	private double callRate;
	
	public PhoneBill(){
		
	}
	public PhoneBill(double monthlyRate, double callRate){
		this.monthlyRate = monthlyRate;
		this.callRate = callRate;
	}
	public double getMonthlyRate(){
		return monthlyRate;
	}
	public void setMonthlyRate(double monthlyRate){
		this.monthlyRate = monthlyRate;
	}
	public double getCallRate(){
		return callRate;
	}
	public void setCallRate(double callRate){
		this.callRate = callRate;
	}
	
	public abstract double calculateBill(int time);
	
}
