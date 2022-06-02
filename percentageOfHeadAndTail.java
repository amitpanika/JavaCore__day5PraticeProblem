package Day5Problems;

import java.util.Scanner;

public class percentageOfHeadAndTail {

	public static void main(String[] args) {
 
	    int HEAD = 1;
	   
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("Enter the number");
	//	double empCheck = Math.floor(Math.random() * 10) % 2;
		Scanner S = new Scanner(System.in);
		 HEAD  = S.nextInt(0);
		if (HEAD == 1)
			System.out.println("HEAD");
		else
			System.out.println("TAIL");
	}

}
