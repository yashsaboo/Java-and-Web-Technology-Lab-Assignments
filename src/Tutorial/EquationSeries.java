package Tutorial;

import java.util.*;
import java.io.*;

class EquationSeries
{
	int a, b, n;
	public static void main(String args[])throws IOException
	{
		int i, j, q;
		double op;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		EquationSeries series[] = new EquationSeries[500];
		System.out.println("Enter the number of queries");
		q = Integer.parseInt(br.readLine());
		for(i=0;i<q;i++)
		{
			series[i] = new EquationSeries();
			series[i].a = Integer.parseInt(br.readLine());
			series[i].b = Integer.parseInt(br.readLine());
			series[i].n = Integer.parseInt(br.readLine());
		}
		//For displaying
		for(i=0;i<q;i++)
		{
			op = series[i].a;
			for(j=0;j<series[i].n;j++)
			{
				op = op+Math.pow(2,j)*series[i].b;
				System.out.print(op+" ");
			}
			System.out.println();
		}

	}
}