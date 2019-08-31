package Tutorial;

import java.util.*;

class Arithmetic
{
	int a, b;
	Arithmetic(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public int add()
	{
		return a+b;
	}
}

class Adder extends Arithmetic
{
	Adder(int a, int b)
	{
		super(a,b);
	}
	public static void main(String args[])
	{
		Adder obj =  new Adder(10,20);
		System.out.println(obj.add());
	}
}
