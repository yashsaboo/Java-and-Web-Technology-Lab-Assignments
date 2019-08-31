package OtherJWT;

import java.util.*;

public class Tut3Prog1 {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String st1 = sc.nextLine();
		StringBuffer sb = new StringBuffer(st1);

		sb.reverse();
		if (st1.equals(sb.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

		sb = sb.append("ad");
		System.out.print("\n\n The String is : " + sb + "\n\n");
	}

}
