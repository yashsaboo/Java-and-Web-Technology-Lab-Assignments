package Lab3;

import java.util.*;

class q1_count_occurance
{
	public static void main(String[] args)
	{
		String str, se;
		int occurance=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the paragraph");
		str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("Enter the search element");
		se = sc.nextLine();
		while(st.hasMoreTokens())
		{
			if(st.nextToken().equals(se))
			{
				occurance++;
			}
		}
		System.out.println("Found "+occurance+" occurance(s) of "+se);
		sc.close();
	}
}
