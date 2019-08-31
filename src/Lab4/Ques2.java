package Lab4;
import java.io.*;
public class Ques2 {
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int[] a = new int[100];
        System.out.println("Enter the value of n");
        int n =Integer.parseInt(br.readLine());
        for(int i=0; i<n;i++)
        {
            System.out.println("Enter the value of "+(i+1));
            a[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<n;i++)
        {
            System.out.println("Element: "+a[i]);
        }
        int j;
        System.out.println();
        for(int i=0; i<n;i++)
        {
            int z = a[i];
            if(z==0)
            {
                for(j=i; j<n-i-1; j++)
                {
                    a[j]=a[j+1];
                }
                a[j]=0;
            }
        }
        for(int i=0; i<n;i++)
        {
            System.out.println("Element: "+a[i]);
        }
    }
}
