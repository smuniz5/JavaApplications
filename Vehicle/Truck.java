//Savannah Muniz

public class Truck extends Automobile {

	protected double towCapacity;
	 
	public Truck(){
		 towCapacity = 1500.0; //default value
	 }
	public Truck(int year, double weight, String licensePlate, String make, double towCapacity){
		this.year = year;
		this.weight = weight;
		this.licensePlate = licensePlate;
		this.make = make;
		this.towCapacity = towCapacity;
	}
	public double getTowCapacity(){
		return towCapacity;
	}
	public void setTowCapacity(double towCapacity){
		this.towCapacity = towCapacity;
	}
	public String toString(){
		return super.toString()+ "\nTowCapacity: "+towCapacity;
	}
}


