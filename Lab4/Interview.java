import java.util.Scanner;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);		
		
String name;		
System.out.print("What is your name? \t"); 
name = input.next();

System.out.println();

int number;
System.out.print("What is your favorite number?\t");
number = input.nextInt();


System.out.println();

String hobbies;
System.out.print("What are you hobbies?\t");
hobbies = input.next();

System.out.println();

String campus; 
System.out.print("Do you live on or off campus?\t");
campus = input.next();

System.out.println();

String color;
System.out.print("What is your favorite color?\t");
color = input.next();

System.out.println();

Float height;
System.out.print("What is your height in inches?\t");
height = input.nextFloat();

System.out.print("So your name is " + name + "." + " Your favorite number is " + number + ". "  + "You like to " + hobbies + ". " + "You live " + campus + " campus. " + "Your favorite color is " + color + ". " + "Your height in inches is " + height + ".");



	}

}
