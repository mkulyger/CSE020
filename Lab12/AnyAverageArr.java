import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner key = new Scanner(System.in);
	int num = 0;
	
		
	System.out.print("This program will find the average of any set of numbers.\n");
	
	System.out.print("\n");
	
	System.out.print("Please choose number of values to average: ");
	int values = key.nextInt();
	
	if (values == 0) {
		System.out.print("\n");
		System.out.print("No numbers to average. Exiting program.");
		return;
	}
	
	else {
	System.out.print("Please choose column width for output formatting: ");
	int width = key.nextInt();
	
		
	System.out.print("\n");
	
	int[] arr = new int[values];
	
	int i = 0; 
	for (i = 0; i < values; i++) {
		System.out.println("Please enter value #" + (i+1) + ": ");
		int number = key.nextInt();
		arr[i] = number; 
		num += arr[i];
	}
	
	System.out.print("\n");
	
	System.out.print("The number being averaged are ...");
	
	  for (i = 0; i < values; i++) 
	 	 if (i % width == 0) {
	  System.out.println();
	  System.out.print(arr[i] + " ");
	}
	  else {
	  System.out.print(arr[i] + " ");
	  
	  }
	
	System.out.print("\n\n");
	
	System.out.print("Average is: " + (double)(num/values));
	
	
	}
	
	}

}
