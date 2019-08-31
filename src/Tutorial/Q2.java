package Tutorial;

import java.io.*;
//Constructor question
class Q2
{
	String name;
	int prn;
	Q2()
	{

	}
	Q2(String n, int no)
	{
		name = n;
		prn = no;
	}

	public static void main(String args[])
	{
		Q2 stud_1 = new Q2();
		Q2 stud_2 = new Q2("Rishabh",152);
		System.out.println("Student 1:");
		System.out.println("Name: "+stud_1.name);
		System.out.println("PRN: "+stud_1.prn);
		System.out.println("Studnt 2");
		System.out.println("Name: "+stud_2.name);
		System.out.println("PRN: "+stud_2.prn);
	}
}