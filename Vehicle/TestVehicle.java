//Savannah Muniz

public class TestVehicle {
	public static void main(String[] args){
		
		Vehicle v = new Vehicle(2017, 2100.56);
		Automobile a = new Automobile(2005, 2500.0, "1SM234", "Chevy");
		Truck t = new Truck(2007, 5000.01, "2MS654", "Ford", 1200.1);
		Car c = new Car(2010, 2500.2, "5GH632", "Honda", 5);
		Tank k = new Tank();
		
		System.out.println("Vehicle\n"+v);
		System.out.println("\nAutomobile\n"+a);
		System.out.println("\nTruck\n"+t);
		System.out.println("\nCar\n"+c);
		System.out.println("\nTank\n"+k);
	}
}
