//Savannah Muniz

public class Dog extends Animal {

	public Dog(){
		
	}
	public Dog(String breed, String name, int age){
		this.breed = breed;
		this.name = name;
		this.age = age;
	}
	
	public String makeNoise(){
		return "bark";
	}
	public String groupBehavior(){
		return "pack";
	}
	public String toString(){
		return "Animal: Dog\nBreed: "+getBreed()+"\nName: "+getName()+"\nAge: "+getAge()+"\nNoise: "+makeNoise()+"\nGroupBehavior: "+groupBehavior();
	}
}
