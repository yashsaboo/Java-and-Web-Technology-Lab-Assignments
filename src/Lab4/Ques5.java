/*
 * W.a.p that declares two arrays named ‘even’ and ‘odd’. 
Accept numbers from the user and move them to respective arrays depending on whether they are even or odd.
 */
package Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques5 {
    public static void main(String args[]) throws IOException
    {
        int e=0,o=0;
        int even[] = new int[100];
        int odd[] = new int[100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of numbers you wish to enter");
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the number");
            int z = Integer.parseInt(br.readLine());
            if(z%2==0)
            {
                even[e]=z;
                e++;
            }
            else
            {
                odd[o]=z;
                o++;
            }
        }
        System.out.println("Even number:");
        for(int i=0;i<e;i++)
        {
            System.out.println(even[i]);
        }
        System.out.println("Odd number:");
        for(int i=0;i<o;i++)
        {
            System.out.println(odd[i]);
        }
    }
}
