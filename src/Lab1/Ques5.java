
/*
	Generate a pyramid for a given number
	Enter Number: 5
	Enter X: 2
	O/P
	0
	2 4
	6 8 10
	12 14 16 18
	20 22 24 26 28
	*/
package Lab1;

import java.io.*;

public class Ques5 {

	public static void main(String args[]) throws IOException {
		int i, j;
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(obj);
		int a = 0;
		System.out.println("Enter Number:");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Enter x:");
		int x = Integer.parseInt(br.readLine());
		for (i = 0; i < num; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(a + " ");
				a = a + x;
			}
			System.out.println();
		}
	}
}
