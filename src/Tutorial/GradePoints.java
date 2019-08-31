package Tutorial;

import java.util.Scanner;
class GradePoints
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks");
		int marks= sc.nextInt();
		if(marks>=85)
		{
			System.out.println("Grade Point: 10");
			System.out.println("Grade: A++");
		}
		else if(marks>=80)
		{
			System.out.println("Grade Point: 9");
			System.out.println("Grade: A+");
		}
		else if(marks>=75)
		{
			System.out.println("Grade Point: 8");
			System.out.println("Grade: A");
		}
		else if(marks>=70)
		{
			System.out.println("Grade Point: 7");
			System.out.println("Grade: B++");
		}
		else if(marks>=65)
		{
			System.out.println("Grade Point: 6");
			System.out.println("Grade: B+");
		}
		else if(marks>=60)
		{
			System.out.println("Grade Point: 5.5");
			System.out.println("Grade: B");
		}
		else if(marks>=55)
		{
			System.out.println("Grade Point: 5");
			System.out.println("Grade: C+");

		}
		else if(marks>=50)
		{
			System.out.println("Grade Point: 4.5");
			System.out.println("Grade: C");
		}
		else if(marks>=40)
		{
			System.out.println("Grade Point: 4");
			System.out.println("Grade: D");
		}
		else
		{
			System.out.println("Grade Point: 0");
			System.out.println("Grade: F");
		}
	}
}