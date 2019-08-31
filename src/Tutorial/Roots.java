package Tutorial;

import java.util.Scanner;
class Roots
{
	public static void main(String args[])
	{
		//ax^2+bx+c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficient of x^2:");
		int a = sc.nextInt();
		System.out.println("Enter the coefficient of x");
		int b = sc.nextInt();
		System.out.println("Enter the coefficient of x^0");
		int c = sc.nextInt();
		//Finding the roots now
		double d;
		d = Math.sqrt((b*b)-(4*a*c));
		double root1, root2;
		root1=(-b+d)/(2*a);
		root2=(-b-d)/(2*a);
		System.out.println("The first root is "+root1);
		System.out.println("The second root is "+root2);
	}
}