package OtherJWT;

import java.util.Scanner;

public class Tut3Prog2 {
	public static void main(String args[]) {
		int z = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String str = sc.nextLine();
		if ((str.length() >= 8) && (str.length() <= 30)) {
			int a = (int) str.charAt(0);
			if ((a >= 65) && (a <= 90) || (a >= 97) && (a <= 122)) {
				for (int i = 1; i < str.length(); i++) {
					int b = (int) str.charAt(i);
					if (((b >= 65) && (b <= 90)) || ((b >= 97) && (b <= 122)) || ((b >= 48) && (b <= 57))
							|| (b == 95)) {

					} else {
						z = 1;
						System.out.println("Invalid");
						break;
					}
				}
				if (z == 0) {
					System.out.println("Valid");

				}
			} else {
				System.out.println("Invalid");

			}
		} else {
			System.out.println("Invalid");
		}
	}

}
