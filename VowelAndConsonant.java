package Day5Problems;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {

		char ch;
		System.out.println("Enter The Letter");
		Scanner scanner = new Scanner(System.in);
		ch = scanner.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

			System.out.println("vowel");
		} else
			System.out.println(" Consonent");
	}

}
