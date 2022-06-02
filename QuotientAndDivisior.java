package Day5Problems;

import java.util.Scanner;

public class QuotientAndDivisior {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number");
		int dividend = scan.nextInt();
		System.out.println("Enter The Number");
		int divisior = scan.nextInt();
		int quotient = dividend / divisior;
		int remainder = dividend % divisior;
		System.out.println("Quotient = " + quotient + "\nReamainder = " + remainder);
	}

}
