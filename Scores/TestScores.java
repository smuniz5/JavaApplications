//Savannah Muniz

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		int num = 0;
		int i = 0;
		
		System.out.print("How many elements do you want to enter? ");
		int numElements = keyboard.nextInt();
		int userArray[] = new int[numElements];
		
		do{
			System.out.println("Enter number "+(i+1)+ ":");
			num = keyboard.nextInt();
			userArray[i] = num;
			i++;	
		}while(i < numElements);
		
		Scores score1 = new Scores(userArray);
		
		try{
		System.out.println("The average is: "+score1.getAverage());
		}catch(IllegalArgumentException e){
			System.out.println("Illegal value was entered. Array elements cannot be negative or greater than 100. ");
		}
		keyboard.close();
	}
}
