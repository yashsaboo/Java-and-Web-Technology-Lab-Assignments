package Lab1;

import java.io.*;

class Employee {
	int empId;
	String empName;
	int basic_sal;
	double gross_sal;

	public void acceptEmp() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Employee ID");
		empId = Integer.parseInt(br.readLine());
		System.out.println("Enter your name");
		empName = br.readLine();
		System.out.println("Enter your basic salary:");
		basic_sal = Integer.parseInt(br.readLine());
	}

	public double calcSal() {
		double da, hra;
		da = basic_sal * 0.15;
		hra = basic_sal * 0.1;
		gross_sal = basic_sal + da + hra;
		return gross_sal;
	}
}

public class Ques7 {
	public static void main(String args[]) throws IOException {
		double salary;
		Employee emp = new Employee();
		emp.acceptEmp();
		salary = emp.calcSal();
		System.out.println("Your final salary would be " + salary);
	}
}
