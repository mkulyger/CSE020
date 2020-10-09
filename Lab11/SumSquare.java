import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
	System.out.print("Please enter the maximum number: ");
	int max = input.nextInt();
	
	int i = 1; 
	int total = 0;
	while (i <= max) { 
	int square = i*i;
	System.out.println("Number " + i + " squared is " + square);
		i++;
	total += square; 
	}
	
	System.out.print("\n");
	System.out.print("The sum of squares of all numbers from 1 to " + max + " is: " + total);
	
	}

}
