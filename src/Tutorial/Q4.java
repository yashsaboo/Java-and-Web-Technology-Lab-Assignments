/*
PATTERN
*****
****
***
**
*
*
**
***
****
*****
*/
package Tutorial;

import java.util.Scanner;
class Q4
{
	public static void main(String args[])
	{
		int stars = 5;
		int i,j;
		//For the top portion
		for(i=stars;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//For the bottom portion
		for(i=0;i<stars;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}