package Day5Problems;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Year");
		int Year = S.nextInt();

		if (Year % 4 == 0)
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");

	}

}
