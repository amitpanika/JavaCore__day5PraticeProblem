package Day5Problems;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		for (int divsior = 2; divsior < num; divsior++) {
			while (num % divsior == 0) {
				num = num / divsior;
				System.out.println(divsior);
			}
		}

	}

}
