import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	int value = 0; 
	int i = 1; 
	double total = 0; 
	
	System.out.print("Enter 0 or less to stop entering numbers.");
	System.out.print("\n");
	
	do {
		System.out.println("Enter value #" + i + ": ");
		value = input.nextInt();
		total += value;
		i++;
	if (value < 0) {
		System.out.print("\n");
		System.out.print("No positive numbers were input.");
		break;
	} 
	} while(value > 0);
	
	System.out.print("\n");
	
	double Average = (double)(total/--i); 
	
	System.out.print("Average is " + Average);
	
	}
	}
