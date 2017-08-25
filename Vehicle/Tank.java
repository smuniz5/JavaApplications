//Savannah Muniz

public class Tank extends Vehicle {

	protected double armorWidth;
	
	public Tank(){
		armorWidth = 5.0; //default value
	}
	public Tank(int year, double weight, double armorWidth){
		this.year = year;
		this.weight = weight;
		this.armorWidth = armorWidth;
	}
	public double getArmorWidth(){
		return armorWidth;
	}
	public void setArmorWidth(double armorWidth){
		this.armorWidth = armorWidth;
	}
	public String toString(){
		return super.toString()+"\nArmor Width: "+armorWidth;
	}
}
