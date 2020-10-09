import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		System.out.print("Please enter the first number:");
		n1 = input.nextInt();

		System.out.print("Please enter the second number:");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average);

		Scanner kb = new Scanner(System.in);

		float n3, n4;

		System.out.print("Please enter the first number:");
		n3 = kb.nextFloat();

		System.out.print("Please enter the second number:");
		n4 = kb.nextFloat();

		float avg;
		avg = (float)((n3+n4)/2);
		System.out.println("The average of the numbers is " + avg);

		short s1, s2;

		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Please enter the first number:");
		s1 = kbd.nextShort();

		System.out.print("Please enter the second number:");
		s2 = kbd.nextShort();

		short shortAvg;
		shortAvg = (short)((s1+s2)/2);
		System.out.print("The average of the numbers is " + shortAvg);		
	}

}
