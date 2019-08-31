package Tutorial;

import java.io.*;
import java.util.Scanner;

class Q6_generating_marksheet
{
	public static void main(String args[])throws IOException
	{
		int i;
		int[] marks;
		marks = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your prn:");
		int prn = Integer.parseInt(br.readLine());
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter your department:");
		String dept = sc.nextLine();
		for(i=0;i<5;i++)
		{
			System.out.println("Enter the Subject "+(i+1)+" marks:");
			marks[i] = Integer.parseInt(br.readLine());
		}
		System.out.println();
		System.out.println("\t\tGRADE SHEET");
		System.out.println("Name: "+name);
		System.out.println("PRN: "+prn);
		System.out.println("Department: "+dept);
		System.out.println();
		for(i=0;i<5;i++)
		{
			System.out.println("Subject "+(i+1)+" "+marks[i]);
		}


	}
}