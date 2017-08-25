//Savannah Muniz

public class Automobile extends Vehicle {

	protected String licensePlate;
	protected String make;
	
	public Automobile(){
		licensePlate = "unknown"; //default value
		make = "unknown"; //default value
	}
	public Automobile(int year, double weight, String licensePlate, String make){
		this.year = year;
		this.weight = weight;
		this.licensePlate = licensePlate;
		this.make = make;
	}
	public String getLicensePlate(){
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate){
		this.licensePlate = licensePlate;
	}
	public String getMake(){
		return make;
	}
	public void setMake(String make){
		this.make = make;
	}
	public String toString(){
		return super.toString()+"\nLicense Plate: "+licensePlate+"\nMake: "+make;
	}
}
