//Savannah Muniz

import java.util.*;
import java.io.*;

public class BinarySum {

	public static void main(String[] args) throws IOException{
		
		int number;
		int sum = 0;
		boolean endOfFile = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		FileOutputStream fstream = new FileOutputStream("Numbers.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		do{
			System.out.println("Enter a number, -1 to end: ");
			number = keyboard.nextInt();
			if(number != -1)
			outputFile.writeInt(number);
		}while (number != -1);
		
		outputFile.close();
		keyboard.close();
		
		FileInputStream istream = new FileInputStream("Numbers.dat");
		DataInputStream inputFile = new DataInputStream(istream);
		
		while (!endOfFile) {
			try {
				sum = sum + inputFile.readInt();
			} catch (EOFException e) {
				endOfFile = true;
			}
		}
		
		System.out.println("The sum is: "+sum);
		inputFile.close();
	}
}
