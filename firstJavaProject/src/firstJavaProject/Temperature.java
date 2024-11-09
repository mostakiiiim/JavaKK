package firstJavaProject;
import java.util.Scanner;

public class Temperature {
	public static void main(String args[]) {
		
	Scanner input = new Scanner (System.in);
	System.out.print("Enter Celsius: ");
	
	float celsius = input.nextFloat();
	
	float fahrenheit = celsius * 9/5 + 32;
	System.out.println(celsius + " Degree Celsius in Farenheit is "+ fahrenheit);;
	
		
	}
}
