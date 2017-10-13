//Savannah Muniz

public class Scores {

	int userArray[];
	double average = 0;
	int sum = 0;
	
	public Scores(int userArray[]){
		this.userArray = userArray;
	}
	public double getAverage(){
		for(int i = 0; i < userArray.length; i++){
			sum = sum +(userArray[i]);
			if (userArray[i] < 0)
				throw new IllegalArgumentException();
			if(userArray[i] > 100)
				throw new IllegalArgumentException();
		}
		average = (double)sum / userArray.length;
		return average;
	}
}
