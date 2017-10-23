//Savannah Muniz

import java.util.Scanner;
import java.util.InputMismatchException;

public class InvalidNumbers {

	public static void main(String[] args){
		
		String input = "";
		int userNum = 0;
		boolean check = true;
		
		java.util.Scanner keyboard = new Scanner(System.in);
		
		do{
		System.out.println("Enter a positive integer: ");
		
		try{
			check = true;
			input = keyboard.nextLine();
			userNum = Integer.parseInt(input);
			if(userNum < 0){
				throw new InputMismatchException();
			}
		}catch(InputMismatchException | NumberFormatException e){
			check = false;
			System.out.println("Incorrect input: A positive integer is required.");
		}
		
		}while(check == false);
		
		System.out.println("The number entered is "+userNum+".");
		System.out.println("Thank you.");
		keyboard.close();
	}
}
