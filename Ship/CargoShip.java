//Savannah Muniz

public class CargoShip extends Ship{

	protected int cap;
	
	public CargoShip(){
		
	}
	public CargoShip(String name, int cap){
		this.name = name;
		this.cap = cap;
	}
	public int getCap(){
		return cap;
	}
	public void setCap(int cap){
		this.cap = cap;
	}
	public String toString(){
		return "Name: "+name+"\nCargo Capacity: "+cap+" tons";
	}
}
