//Savannah Muniz

public abstract class Animal {

	protected String breed;
	protected String name;
	protected int age;
	
	public Animal(){
		
	}
	public Animal(String breed, String name, int age){
		this.breed = breed; 
		this.name = name;
		this.age = age;
	}
	public String getBreed(){
		return breed;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public abstract String makeNoise();
	public abstract String groupBehavior();
	public abstract String toString();
	
}
