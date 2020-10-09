import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scnr = new Scanner(System.in);

String name;
String major;
String hometown;
String age;
String movie;

System.out.print("What is your name?");
name = scnr.next();

System.out.print("What is your major?");
major = scnr.next();

System.out.print("Where is your hometown?");
hometown = scnr.next();

System.out.print("How old are you?");
age = scnr.next();

System.out.print("What is your favorite movie?");
movie = scnr.next();

System.out.println();

System.out.print("Their name is ");
System.out.println(name); 

System.out.print("Their major is ");
System.out.println(major);

System.out.print("They are from ");
System.out.println(hometown);

System.out.print("They are ");
System.out.println(age);

System.out.print("Their favorite movie is ");
System.out.println(movie);
	}

}
