//Savannah Muniz

import java.util.Date;

public class Time {

	public static void main(String[] args){
			
		Date date = new Date();
		System.out.println("At the execution of this program, system local time is: " +date.toString()+".");
		
		long seconds, minutes, hours;
		
		long diff = date.getTime();
		diff = diff / 1000;
		hours = diff / 3600;
		minutes = (diff % 3600) / 60;
		seconds = (diff % 3600) % 60;
		
		System.out.println("Time elapsed since Unix Time Epoch: "+hours+" hours, " +minutes+" minutes, and " +seconds+" seconds.");

	}
}
