//Savannah Muniz

public class Car extends Automobile {

	protected int maxPassengers;
	
	public Car(){
		maxPassengers = 7; //default value
	}
	public Car(int year, double weight, String licensePlate, String make, int maxPassengers ){
		this.year = year;
		this.weight = weight;
		this.licensePlate = licensePlate;
		this.make = make;
		this.maxPassengers = maxPassengers;
	}
	
	public int getMaxPassengers(){
		return maxPassengers;
	}
	public void setMaxPassengers(int maxPassengers){
		this.maxPassengers = maxPassengers;
	}
	public String toString(){
		return super.toString()+"\nMax Passengers: "+maxPassengers;
	}
}
