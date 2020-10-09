import java.util.Scanner;

public class Manipulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int n1; 
		int n2; 
		
		System.out.println("Input two integers: ");
		
		n1 = kb.nextInt();
		n2 = kb.nextInt();
		
		
		int sum = n1 + n2;
		
		System.out.println("Sum of " + n1 + " and " + n2 + " is " + sum);
		
		int diff = n1 - n2; 
		
		System.out.println("Difference of " + n1 + " and " + n2 + " is " + diff);
		
		int pro = n1 * n2; 
		
		System.out.println("Product of " + n1 + " and " + n2 + " is " + pro);
		
		int div = n1/n2; 
		
		System.out.println("Integer cast of " + n1 + "/" + n2 + " is " + div);
		
		int rma = n1%n2;
		
		System.out.println("Integer cast of " + n1 + " % " + n2 + " is " + rma);
		
		//short
		
		Scanner key = new Scanner(System.in);
		short n3, n4; 
 
		
		System.out.println("Input two shorts: ");
		
		n3 = key.nextShort();
		n4 = key.nextShort();
		
		
		short add = (short)(n3 + n4);
		
		System.out.println("Sum of " + n3 + " and " + n4 + " is " + add);
		
		short subt = (short)(n3 - n4); 
		
		System.out.println("Difference of " + n3 + " and " + n4 + " is " + subt);
		
		short mul = (short)(n3 * n4); 
		
		System.out.println("Product of " + n3 + " and " + n4 + " is " + mul);
		
		short sep = (short)(n3/n4); 
		
		System.out.println("Short cast of " + n3 + " / " + n4 + " is " + sep);
		
		short rmd = (short)(n3%n4);
		
		System.out.println("Short cast of " + n3 + " % " + n4 + " is " + rmd);
			
		//float
		
		Scanner kbd = new Scanner(System.in);
		
		float n5, n6; 
 
		System.out.println("Input two floating points: ");
		
		n5 = kbd.nextFloat();
		n6 = kbd.nextFloat();
		
		
		float ad = (float)(n5 + n6);
		
		System.out.println("Sum of " + n5 + " and " + n6 + " is " + ad);
		
		float take = (float)(n5 - n6); 
		
		System.out.println("Difference of " + n5 + " and " + n6 + " is " + take);
		
		float produ = (float)(n5 * n6); 
		
		System.out.println("Product of " + n5 + " and " + n6 + " is " + produ);
		
		float divi = (float)(n5/n6); 
		
		System.out.println("Float cast of " + n5 + " / " + n6 + " is " + divi);
		
		float rema = (float)(n5%n6);
		
		System.out.println("Float cast of " + n5 + " % " + n6 + " is " + rema);
	
		//double
		Scanner kyd = new Scanner(System.in);
		
		double n7, n8; 
		 
		System.out.println("Input two doubles: ");
		
		n7 = kyd.nextDouble();
		n8 = kyd.nextDouble();
		
		
		double put = (double)(n7 + n8);
		
		System.out.println("Sum of " + n7 + " and " + n8 + " is " + put);
		
		double asid = (double)(n7 - n8); 
		
		System.out.println("Difference of " + n7 + " and " + n8 + " is " + asid);
		
		double product = (double)(n7 * n8); 
		
		System.out.println("Product of " + n7 + " and " + n8 + " is " + product);
		
		double division = (double)(n7/n8); 
		
		System.out.println("Double cast of " + n7 + " / " + n8 + " is " + division);
		
		double remain = (double)(n7%n8);
		
		System.out.println("Double cast of " + n7 + " % " + n8 + " is " + remain);
	
		
		
		
		
		
	}

}
