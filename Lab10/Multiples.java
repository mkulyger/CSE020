import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in); 
		
	System.out.print("This program prints out multiples of a given number till a specified maximum. \n");	
	
	System.out.print("\n");
	
	System.out.print("Please enter the maximum number: ");
	int max = key.nextInt();
		
	System.out.print("Please enter the number whose multiples to print: ");
	int mul = key.nextInt();
	
	System.out.print("\n");
	
	System.out.print("Multiples of " + mul + " from 1 till " + max + " are: \n");
	
	int i = 1; 
	while (i < max)
	{
		int multi = ((mul%max)*i); 
		
		if(max < multi)
			break;
		
		System.out.println("Number " + multi);
	i++;
	
	} 
	}

}
