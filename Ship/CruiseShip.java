//Savannah Muniz

public class CruiseShip extends Ship{

	protected int maxPassengers;
	
	public CruiseShip(){
		
	}
	public CruiseShip(String name, int maxPassengers){
		this.name = name;
		this.maxPassengers = maxPassengers;
	}
	public int getMaxPassengers(){
		return maxPassengers;
	}
	public void setMaxPassengers(int maxPassengers){
		this.maxPassengers = maxPassengers;
	}
	public String toString(){
		return "Name: "+name+"\nMaximum Passengers: "+maxPassengers;
	}
}
