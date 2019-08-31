package Tutorial;

import java.util.*;
import java.io.*;
//Employee Database and Test

class Q1
{
	public static void main(String args[])throws IOException
	{
		Database db = new Database();
		db.calculate();
		db.display();
	}
}

class Employee
{
	String name;
	int empId, basic_sal;
	double da, hra, gross_sal;
	public void getData()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your good name:");
		name = br.readLine();
		System.out.println("Enter your employee ID:");
		empId = Integer.parseInt(br.readLine());
		System.out.println("Enter your basic salary");
		basic_sal = Integer.parseInt(br.readLine());
	}
	public double getCalc()
	{
		da = basic_sal*0.15;
		hra = basic_sal*0.1;
		gross_sal = basic_sal+da+hra;
		return gross_sal;
	}
	public void printData()
	{
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Number: "+empId);
		System.out.println("Employee Gross Salary "+gross_sal);
		System.out.println();
	}

}

class Database
{
	int i;
	Employee e[] = new Employee[5];
	public void calculate()throws IOException
	{
		for(i=0;i<2;i++)
		{
			e[i]=new Employee(); 
			e[i].getData();
			e[i].getCalc();
		}
	}
	public void display()
	{
		for(i=0;i<2;i++)
		{
			e[i].printData();
		}
	}
}