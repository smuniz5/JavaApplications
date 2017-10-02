//Savannah Muniz

import java.util.*;
import java.io.*;

public class FileSum {
	
	public static void main(String[] args) throws IOException{
		
		int number;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		File file = new File("FileSum.txt");
		FileWriter fw = new FileWriter(file, false);
		PrintWriter p = new PrintWriter(fw);
		
		do{
		System.out.println("Enter number, -1 to end: ");
		number = keyboard.nextInt();
		if(number != -1)
		p.print(number+" ");
		}while(number != -1);
		
		p.close();
		keyboard.close();
		Scanner input = new Scanner(file);
		
		if(!file.exists()) {
			System.out.println("The file is not found");
			System.exit(0);
		}
		
		while(input.hasNext()){
			sum = sum + input.nextInt();
		}
		
		System.out.println("The sum is: "+sum);
	
		input.close();
		
	}

}
