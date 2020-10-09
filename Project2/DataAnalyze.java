import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		//Sample Size (1)	
		System.out.print("Please enter the sample size: ");
		int size = input.nextInt();

		if (size == 0) {
			System.out.print("No data to analyze. Ending Program.");
			return;
		}
		
		int trial = 4;

		int[] info = new int[size*trial];
		int[] totAmount = new int[trial];
		double [] AVE = new double[trial]; 

		int i = 0;
		int a = 0;

		//Trials (2)

		for (i = 0; i < trial; i++) {

			System.out.print("Enter number for Trial " + (i + 1));

			System.out.print("\n");

			for (a = 0; a < size; a++) {
				System.out.println("Enter sample #" + (a + 1) + ": ");

				info[a*trial + i] = input.nextInt();

				totAmount[i] += info[a*trial + i]; 

			}

			System.out.print("\n");

		}
		//Averages (4)

		for (i = 0; i < trial; i++) 

			AVE[i] = totAmount[i] / size;

		double min = AVE[0];
		double max = AVE[0];

		for (i = 0; i < trial; i++) {

			if (AVE[i] < min) 
				min = AVE[i];

			if (AVE[i] > max) 
				max = AVE[i];

		}


		//Formatting  (3)

		System.out.println("\tSample # \tTrial 1 \tTrial 2 \tTrial 3 \tTrial 4");

		for (a = 0; a < size; a++) {
			System.out.print("\t" + (a+1) + "\t");

			for (i = 0; i < trial; i++) {
				System.out.print("\t" + info[a*trial + i] + "\t");
		}


		System.out.print("\n");
		}
		
		System.out.print("\t--------------------------------------------------------------------------");

		System.out.print("\n");
		

		System.out.print("Averages:" + "\t\t");

		// System.out.print("\n\n");

		for (i = 0; i < trial; i++) {
			System.out.print((double)AVE[i] + "\t\t");
		}

		System.out.print("\n");
		
		System.out.print("\n");

		System.out.print("Min Average: " + min);

		System.out.print("\n");

		System.out.print("Max Average: " + max);

		System.out.print("\n");
		System.out.print("\n");

		//Matching Minimum and Maximum (5)

		if (max == min) {
			System.out.print("The trials match EXACTLY!");
		} else if (max < 2*min) {
			System.out.print("The trials concur with each other!");
		} else {
			System.out.print("The trials do NOT concur!");
		}



	}
}