package Tutorial;

import java.io.*;

class Father
{
	String name, surName;
	Father(String name, String surName)
	{
		this.name = name;
		this.surName = surName;
	}
	public void show_Hair()
	{
		System.out.println(name+" "+surName+" has bald hair.");
	}
}

class Son extends Father
{
	String name;
	Son(String first, String dadsname, String surName)
	{
		super(dadsname, surName);
		name = first;
	}
	public void show_Eye_Sight()
	{
		System.out.println(name+" "+surName+" is blind.");
	}
	public static void main(String args[])
	{
		Son obj = new Son("Gabriel","Garcia","Marquez");
		obj.show_Hair();
		obj.show_Eye_Sight();
	}
}