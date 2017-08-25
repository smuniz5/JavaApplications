//Savannah Muniz

public class Vehicle {

	protected int year;
	protected double weight;
	
	public Vehicle(){
		year = 2000; //default value
		weight = 2000; //default value
	}
	
	public Vehicle(int year, double weight){
		this.year = year;
		this.weight = weight;
	}
	
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public String toString(){
		return "Year: "+year+ "\nWeight: "+weight;
	}

}
