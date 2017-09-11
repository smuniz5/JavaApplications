//Savannah Muniz

public class Cat extends Animal {

	public Cat(){
		
	}
	public Cat(String breed, String name, int age){
		this.breed = breed;
		this.name = name;
		this.age = age;
	}
	public String makeNoise(){
		return "Meow";
	}
	public String groupBehavior(){
		return "none";
	}
	public String toString(){
		return "Animal: Cat\nBreed: "+getBreed()+"\nName: "+getName()+"\nAge: "+getAge()+"\nNoise: "+makeNoise()+"\nGroupBehavior: "+groupBehavior();
	}
}
