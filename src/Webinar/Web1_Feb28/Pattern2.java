package Webinar.Web1_Feb28;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = 1;
		while (row <= n) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}

			System.out.println();
			nst = nst + 1;
			row = row + 1;
		}

	}

}
