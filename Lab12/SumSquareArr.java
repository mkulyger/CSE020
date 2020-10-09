import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner key = new Scanner(System.in);
	
	System.out.print("Please enter the maximum number: ");
	int max = key.nextInt();
	
	int[] arr1 = new int[max + 1];
	int[] arr2 = new int[max + 1];
	int[] arr3 = new int[max + 1];
	
	if (max == 0) {
		System.out.print("\n");
		System.out.print("No numbers to sum up. Exiting program.");
	}
	
	else {
	
	System.out.print("\n");
	
	System.out.print("Contents of Arr 1 (for-loop), Arr2 (while-loop), and Arr3 (do-while-loop) are:");
	
	System.out.print("\n");
	
		int i = 1; 
	
	// For-loop to calculate
			for (i = 1; i <= max; i++)
				arr1[i] = arr1[i - 1] + i*i;
	
			i = 1;

			// While-loop to calculate
			while (i <= max) {
				arr2[i] = arr2[i - 1] + i*i;
				i++;
			}

			i = 1;

			// Do-While-loop to calculate
			do
				arr3[i] = arr3[i - 1] + i*i;
			while (++i <= max);

			for (i = 0; i <= max; i++)
				System.out.println("Arr1 " + arr1[i] + " Arr2 " + arr2[i] + " Arr3 " + arr3[i]);

			System.out.print("\n");
			
			System.out.println("Sum of Squares of numbers from 1 to " + max + " is: " + arr1[max]);

			key.close();		
	
			
	}
	}

}
