package Tutorial;

import java.io.*;
//Student with grade calculation
class grade
{
	void gradeCalc(double marks)
	{
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

public class Q3
{
	public static void main(String args[])throws IOException
	{
		int i;
		int marks[] = new int[5];
		double average=0;
		grade g = new grade();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(i=0;i<5;i++)
		{
			System.out.println("Please enter marks of Subject "+(i+1));
			marks[i] = Integer.parseInt(br.readLine());
			average = average+marks[i];
		}
		average = (average/5);
		g.gradeCalc(average);
	}
}