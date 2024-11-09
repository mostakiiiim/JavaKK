package firstJavaProject;
import java.util.Scanner;
public class ReverseNumber {
	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int newnum = 0;
		System.out.println(number);
		while(number!=0) {
		int tempnum = number % 10;
		number = number/10;
		newnum = newnum * 10 + tempnum;
		
		
		}
		System.out.println(newnum);
	}

}
