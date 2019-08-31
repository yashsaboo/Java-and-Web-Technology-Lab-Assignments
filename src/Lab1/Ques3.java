package Lab1;

/*Using switch case for
A. Factorial of a given number
B. Check whether given number is prime or not.
C. Even or odd
D. Fibonacci Series
E. Reverse of given number and do the the addition of all digits
*/
import java.util.*;
public class Ques3
{
	public static void main(String args[])
	{
		int choice, i, num;
		Scanner sc= new Scanner(System.in);
		System.out.println("MAIN MENU");
		System.out.println("1. Factorial");
		System.out.println("2. Checking for prime");
		System.out.println("3. Even or Odd");
		System.out.println("4. Fibonacci Series");
		System.out.println("5. Reverse of a given number & addition of digits");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				//Code for Factorial
				int fact = 1;
				System.out.println("Enter the number");
				num = sc.nextInt();
				for(i=num;i>1;i--)
				{
					fact = i*fact;
				}
				System.out.println("The factorial is "+fact);
				break;
			case 2:
				//Code for checking for prime numbers
				int prime=1;
				System.out.println("Enter the number:");
				num = sc.nextInt();
				for(i=2;i<=num/2;i++)
				{
					if(num%i==0)
					{
						prime = 0;
						break;
					}
				}
				if(prime == 1)
				{
					System.out.println("The number is a prime number");
				}
				else
					System.out.println("The number is not a prime number");
				break;
			case 3:
				//Checking for even or odd
				System.out.println("Enter the number:");
				num = sc.nextInt();
				if(num%2==0)
				{
					System.out.println("The number is even");
				}
				else
					System.out.println("The number is odd");
				break;
			case 4:
				//Generating a Fibonacci Series
				System.out.println("How many numbers would you like?");
				num = sc.nextInt();
				int first_num=0;
				int second_num=1;
				int third_num;
				System.out.print(first_num+" ");
				System.out.print(second_num+" ");
				for(i=0;i<num-2;i++)
				{
					third_num = second_num + first_num;
					System.out.print(third_num+(" "));
					first_num = second_num;
					second_num = third_num;
				}
				break;
			case 5:
				//Reverse of a number and the sum of the digits
				int j, sum=0; 
				int[] digits;
				digits = new int[10];
				System.out.println("Enter the number:");
				num = sc.nextInt();
				for(i=0;num!=0;i++)
				{
					digits[i]=num%10;
					num = num/10;
				}
				System.out.print("The reverse of the number is ");
				for(j=0;j<i;j++)
				{
					System.out.print(digits[j]+" ");
				}
				System.out.print("The sum of the digits is ");
				for(j=0;j<i;j++)
				{
					sum = sum + digits[j];
				}
				System.out.print(sum);
				break;
		}
		sc.close();
	}
}