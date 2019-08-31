package Lab4;
import java.io.*;
public class Ques3 {
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
        System.out.println();
        for(int i=0; i<n;i++)
        {
            int z = a[i];
            if(i==0)
            {
                if(z>a[i+1])
                    System.out.println("Peak Element: "+a[i]);
            }
            else if(i==n-1)
            {
                if(z>a[i-1])
                    System.out.println("Peak Element: "+a[i]);
            }
            else
            {
                if((z>a[i-1])&&(z>a[i+1]))
                    System.out.println("Peak Element: "+a[i]);
            }
        }
    }
}
