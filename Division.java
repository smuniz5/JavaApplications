//Savannah Muniz

import java.util.Scanner;
import java.util.InputMismatchException;

public class Division {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int number1, number2;
		double result;
		
		try{
			number1 = keyboard.nextInt();
			number2 = keyboard.nextInt();
		
			if(number2 != 0){
				System.out.print(number1+" / "+number2+" = "+(result = ((double)number1 / number2)));
			}
			else{
				result = number1 / number2;
			}
		}catch(ArithmeticException a){
			System.out.println("Divisor cannot be 0.");
		}catch(InputMismatchException i){
			System.out.println("User inputs cannot be characters.");
		}
		
	}
}

