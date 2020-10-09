import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	 
	System.out.print("This program will find the average of as many as you like. \n");
	
	System.out.print("\n");
	
	System.out.print("Please choose the number of values to average: ");
	int values = input.nextInt();
	
	int i = 1;
	int num = 0;
	int total = 0; 
	
	while (i <= values) {
	System.out.println("Please enter the " + i + " number: ");
	num = input.nextInt();
	total += num;
	i++;
	}
	double average = (double)(total/values);
	System.out.print("\n");
	System.out.print("The average of all the numbers is: " + average);
	
/*	System.out.print("\n");
	double average = total/i;
	System.out.print("The average of all the numbers is: " + average);
*/
}
}
