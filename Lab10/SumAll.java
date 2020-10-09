import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner input = new Scanner(System.in);	
	int count = 0;
		
	System.out.print("This program will find the sum of all numbers till a specified maximum. \n");
	
	System.out.print("\n");
	
	System.out.print("Please enter the max amount of numbers to add: ");
	int max = input.nextInt();
	
	int i = 0; 
	int total = 0;
	
	while (i <= max) { 
		System.out.println("Number " + i);
		i++; 
	total += max;
		
	}
		
	System.out.print("\n");
	
	System.out.print("The sum of all numbers from 0 to " + max + " is: " + total/2);

	
	}

}
