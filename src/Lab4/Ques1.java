package Lab4;
import java.io.*;
public class Ques1 {
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int[] a = new int[100];
        System.out.println("Enter the value of n and k");
        int n =Integer.parseInt(br.readLine());
        int k =Integer.parseInt(br.readLine());
        int z = (int) n/k;
        for(int i=0; i<n;i++)
        {
            System.out.println("Enter the value of "+(i+1));
            a[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<n;i++)
        {
            int p = a[i];
            int l=0;
            for(int k1=0;k1<i;k1++)
            {
                if(p==a[k1])
                {
                    l=1;
                }
            }
            if (l==1)
            {
                
                int occurence = 0;
                for(int j=i; j<n; j++)
                {
                    if(p==a[j])
                    {
                        occurence++;
                    }
                }
                if(occurence>z)
                    System.out.println(p);
            }
            l=0;
        }
    }
}
