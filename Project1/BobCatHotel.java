import java.util.Random;
import java.util.Scanner;

public class BobCatHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbd = new Scanner(System.in);

		double Single = 50.50;
		double Double = 75.00;
		double Queen = 100.75;
		double King = 150.25;
		double Master = 225.50;
		double rmPrice = 0;

		int guests; 
		int room; 
		int nights;
		int AAA;
		int APrice;
		int club;
		double CPrice = 0;
		int meal = 0;

		int Complementary = 0; 
		int Standard = 30;
		int Deluxe = 50;
		int Indulgence = 85; 
		int mPrice = 0;

		double Preliminary = 0;
		double Food = 0;
		double Room = 0;
		double Discount1 = 0;
		double Discount2 = 0;
		double Total = 0;

		System.out.println("Room Options");

		System.out.print("1. Single @ $" + Single + " per night \n");
		System.out.print("2. Double @ $" + Double + " per night \n");
		System.out.print("3. Queen @ $" + Queen + " per night \n");
		System.out.print("4. King @ $" + King + " per night \n");
		System.out.print("5. Master Suite @ $" + Master + " per night \n");

		System.out.print("\n");

		System.out.print("Number of guests: ");
		guests = kbd.nextInt();

		System.out.print("Please your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): ");
		room = kbd.nextInt();

		switch(room) {
		case 1:
			room = 1;
			rmPrice = Single;
			break;
		case 2: 
			room = 2;
			rmPrice = Double;
			break;
		case 3:
			room = 3;
			rmPrice = Queen;
			break;
		case 4:
			room = 4;
			rmPrice = King;
			break;
		case 5:
			room = 5;
			rmPrice = Master;
			break;
		}

		System.out.print("Please enter the number of nights of: ");
		nights = kbd.nextInt();

		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		AAA = kbd.nextInt();

		System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		club = kbd.nextInt();	

		System.out.print("\n");

		Random rand = new Random();
		Discount2 = rand.nextInt(10); 
		if (club == 1 && Discount2 >= 4) {
			System.out.print("Congratulations! You've qualified for our 'Stay 4 nights get 5th free promotion \n" + "Discount will be applied during checkout depending on the number of days \n");
		}
		else if (Discount2 <= 3) {
			System.out.print("");
			System.out.print("Unfortunately, you didn't qualify for our 'Stay 4 nights get 5th free promotion. Better luck next time!\n");
		}

		System.out.print("\n");

		if (room != 5) {
			System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)");
			System.out.print("0. Complementary @ $" + Complementary + " per guest \n");
			System.out.print("1. Standard @ $" + Standard + " per guest \n");
			System.out.print("2. Deluxe @ $" + Deluxe + " per guest");

			System.out.println("\n");

			System.out.print("Please select your desired meal package (enter 0/1/2 corresponding to the options shown above): ");
			meal = kbd.nextInt();	
		}

		if (room == 5) {
			System.out.print("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT) \n");
			System.out.print("0. Complementary @ $" + Complementary + " per guest \n");
			System.out.print("1. Standard @ $" + Standard + " per guest \n");
			System.out.print("2. Deluxe @ $" + Deluxe + " per guest \n");
			System.out.print("3. Indulgence @ $" + Indulgence + " per guest");

			System.out.println("\n");

			System.out.print("Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown above): ");
			meal = kbd.nextInt();
		}

		if (meal == 0) {
			mPrice = Complementary;

		} else if (meal == 1) {
			mPrice = Standard;

		} else if (meal == 2) {
			mPrice = Deluxe;

		} else if (meal == 3) {
			mPrice = Indulgence;
		}

		System.out.print("\n");

		System.out.println("CHECKOUT");

		Room = (double)(nights*rmPrice);
		System.out.print("Room Cost: \t\t $" + Room + "\n");

		if (meal == 0) {
			System.out.print("");
		}
		else if (meal != 0) {
			Food = (double)(guests*nights*mPrice);
			System.out.print("Meal Cost:\t\t+$" + Food + "\n");
		}

		Preliminary = Room + Food;
		System.out.print("Preliminary Total Cost:  $" + Preliminary + "\n");

		if (AAA == 0 && club == 0) {
			System.out.print("No Discounts Applied");
			System.out.print("\n");
		} 
		else if (AAA == 0) {
			System.out.print("");
		}
		else if (AAA == 1) {  
			Discount1 = 0.10 * Preliminary;
			System.out.print("AAA Discount:\t\t-$" + Discount1 + "\n");
		}

		if (club == 0) {
			CPrice = 0;
		}
		else if (club == 1) {
			CPrice = ((double)(nights%4 * rmPrice));
			System.out.print("Club Member Discount:\t-$" + CPrice + "\n"); 
		}

		Total = Preliminary - (Discount1 + CPrice);
		System.out.print("Total Cost of Booking: \t $" + Total + "\n");

	}

}
