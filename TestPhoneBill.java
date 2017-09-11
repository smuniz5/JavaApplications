//Savannah Muniz

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestPhoneBill {

	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatMoney = new DecimalFormat("$00.00");
		
		double callRate, monthlyRate, bill;
		int time;
		
		System.out.println("This program will calculate your phone bill for you.");
		
		System.out.println("What is your call rate?");
		callRate = keyboard.nextDouble();
		
		System.out.println("What is your monthly rate?");
		monthlyRate = keyboard.nextDouble();
		
		System.out.println("How many minutes did you talk?");
		time = keyboard.nextInt();
		
		PhoneBill p = new LongDistanceBill(monthlyRate, callRate);
		
		bill = p.calculateBill(time);
		
		System.out.println("Your monthly bill is "+formatMoney.format(bill)+".");
		
		keyboard.close();
	}
}
