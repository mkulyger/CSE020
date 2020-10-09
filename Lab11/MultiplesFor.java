import java.util.Scanner;

public class MultiplesFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	
	System.out.print("This program prints out multiples of a base number till a specified maximum. \n");
	System.out.print("\n");
	
	System.out.print("Please enter the maximum number: ");
	int max = input.nextInt();
	
	System.out.print("Please enter the base number whose multiples to print: ");
	int mul = input.nextInt();
	
	System.out.print("\n");
	
	System.out.print("Multiples of " + mul + " from 1 till " + max + " are: \n");
	
	for (int i = 1; i <= max ; i++)  {
		if(i % mul == 0) {
		System.out.println("Number " + i);
		
	}
	
	
	}
	}
	}
