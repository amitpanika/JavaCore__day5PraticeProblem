package Day5Problems;

import java.util.Scanner;

public class EvenOdd {
	// *
	// FIRST I'M USING VARIABLE (NUM);
	// SECOND I'M USING SCANNER CLASS FOR USER INPUT();
	// THIRD I'M USING (IF),(ELSE) FOR PRINTING ABOUT EVEN OR ODD;
	//

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("Even");
		} else
			System.out.println("Odd");
	}
}
