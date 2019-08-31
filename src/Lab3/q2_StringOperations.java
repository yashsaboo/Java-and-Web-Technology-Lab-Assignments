package Lab3;

/*copy, concatenate, length, reverse, palindrome, string compare, find occurances of substring */
import java.io.*;

class TheStringOperations
{
	private String s1, s2;
	public void input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first string");
		s1 = br.readLine();
		System.out.println("Enter the second string");
		s2 = br.readLine();
	}
	public void copy()
	{
		System.out.println("The strings before performing copy:");
		System.out.println("String 1 "+s1);
		System.out.println("String 2 "+s2);
		s1 = s2;
		System.out.println("The string after copy");
		System.out.println("String 1 "+s1);
		
	}
	public void conCatenate()
	{
		System.out.println("The strings before performing copy:");
		System.out.println("String 1 "+s1);
		System.out.println("String 2 "+s2);
		s1 = s1.concat(s2);
		System.out.println("The string after concatenation");
		System.out.println("String 1 "+s1);
	}
	public void length()
	{
		System.out.println("String 1 Length: "+s1.length());
		System.out.println("String 2 Length: "+s2.length());
	}
	public void reverseString()
	{
		StringBuffer s3 = new StringBuffer(s1);
		StringBuffer s4 = new StringBuffer(s2);
		s3 = s3.reverse();
		s4 = s4.reverse();
		System.out.println("Reverse of String 1 "+s3);
		System.out.println("Reverse of String 2 "+s4);
	}
	public void checkPalindrome()
	{
		StringBuffer s3 = new StringBuffer(s1);
		StringBuffer s4 = new StringBuffer(s2);
		if(s1.equals(s3.reverse().toString()))
		{
			System.out.println("The first string "+s1+" is a palindrome");

		}
		else
		{
			System.out.println("The first string "+s1+" is not a palindrome");
		}
		if(s2.equals(s4.reverse().toString()))
		{
			System.out.println("The second string"+s2+" is a palindrome");
		}
		else
		{
			System.out.println("The second string"+s2+" is not a palindrome");
		}
	}
	public void stringCompare()
	{
		if(s1.equals(s2))
		{
			System.out.println("The two strings are the same");
		}
		else
		{
			System.out.println("The two strings are not the same");
		}
	}
/*	public void subStringOccurance()
	{
		int ch, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which string would you like to find the occurance of?");
		System.out.println("1.First String");
		System.out.println("2.Second String");
		ch = sc.nextInt();
		switch(ch){
			case 1:
				System.out.println("Enter the word you want to search");
				String se = sc.nextLine();
				for(int i=0;i<s1.length();i++)
				{
					if(se.equals(s1.trim(i,i+5)))
						count++;
				}
				break;
			case 2:
				System.out.println("Enter the word you want to search");
				for(int i=0;i<s2.length();i++)
				{
					if(se.equals(s2.trim(i,i+5)))
						count++;
				}
				break;
		}
		
	}
	*/	
}

class q2_StringOperations
{
	public static void main(String[] args)throws IOException
	{
		int choice;
		boolean a = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TheStringOperations sto = new TheStringOperations();
		sto.input();
		while(a)
		{
			System.out.println("What would you like to do?");
			System.out.println("1.Copy");
			System.out.println("2.Concatenate");
			System.out.println("3.Finding length");
			System.out.println("4.Reverse");
			System.out.println("5.Palindrome Checking");
			System.out.println("6.String compare");
			System.out.println("7.Finding occurances of Sub String");
			System.out.println("8.Exit");
			choice = Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1:
					sto.copy();
					break;
				case 2:
					sto.conCatenate();
					break;
				case 3:
					sto.length();
					break;
				case 4:
					sto.reverseString();
					break;
				case 5:
					sto.checkPalindrome();
					break;
				case 6:
					sto.stringCompare();
					break;
				case 7:
					break;
				case 8:
					a = false;
					break;
			
			}
		}
	}
}


