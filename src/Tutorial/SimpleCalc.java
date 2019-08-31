package Tutorial;

import java.util.Scanner;

class SimpleCalc
{
	int a, b;
	public int addition()
	{
		return a+b;
	}
	public int subtraction()
	{
		return a-b;
	}
	public int multiply()
	{
		return a*b;
	}
	public double divide()
	{
		return a/b;
	}
	public static void main(String[] args)
	{
		int choice, result=0;
		double answer=0;
		SimpleCalc calc = new SimpleCalc();
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tMAIN MENU");
		System.out.println("1.Addition\n2.Subtraction");
		System.out.println("3.Multiply\n4.Divide");
		choice = sc.nextInt();
		System.out.print("Enter the first number: ");
		calc.a = sc.nextInt();
		System.out.print("Enter the second number: ");
		calc.b = sc.nextInt();
		switch(choice)
		{
			case 1:
				result = calc.addition();
				break;
			case 2:
				result = calc.subtraction();
				break;
			case 3:
				result = calc.multiply();
				break;
			case 4:
				answer = calc.divide();
				break;
		}
		if(choice==4)
			System.out.println("Result is "+answer);
		else
			System.out.println("Result is "+result);

	}
}