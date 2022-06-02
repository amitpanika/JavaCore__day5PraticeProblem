package Day5Problems;

import java.util.Scanner;

public class LargestThreeDigitNum {

	public static void main(String[] args) {
		int a, b, c;

		// ** OBJECT OF THE SCANNER CLASS..................>>>>>>

		Scanner num = new Scanner(System.in);

		// ** Read input from the user.....................>>>>>>

		System.out.println("Enter the number");
		a = num.nextInt();

		System.out.println("Enter the number");

		b = num.nextInt();

		System.out.println("Enter the number");

		c = num.nextInt();

		// * COMPARING

		if (a > b && a > c) {
			System.out.println("The largest num is A");
		} else if (b > a && a > c) {
			System.out.println("The largest num is B ");
		} else if (c > a && c > b) {
			System.out.println("The largest num is C");

		}

	}

}
