package Tutorial;

import java.util.*;
import java.io.*;

class Q8
{
	public static void main(String args[])throws IOException
	{
		Electricity eBill = new Electricity();
		eBill.acceptNum();
		eBill.calcBill();
		eBill.printBill();
	}
}

class Electricity
{
	//Calculate and print electriciy bill
	double bill = 0;
	int units;
	public void acceptNum()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of units used");
		units = Integer.parseInt(br.readLine());
	}

	public void calcBill()
	{
		if(units>=100)
		{
			bill = bill+(100*1.5);
			units = units -100;
			if(units>=100)
			{
				bill = bill+(100*2);
				units = units - 100;
				if(units>=50)
				{
					bill = bill+(50*2.5);
					units = units -50;
					if(units>0)
					{
						bill = bill + (units*4);
					}
				}
				else
				{
					bill = bill+(units*2.5);
				}
			}
			else
			{
				bill = bill+(units*2);
			}
		}
		else
		{
			bill = bill+(units*1.5);
		}
	}
	public void printBill()
	{
		System.out.println("The final electricity bill is "+bill);
	}
}