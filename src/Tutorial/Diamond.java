package Tutorial;

import java.util.*;
class Diamond
{
    public static void main(String args[])
    {
        int i, j, k;
        for(i=0;i<=7/2;i++)
        {
            for(j=i;j<(7/2+1);j++)
            {
                System.out.print("       ");
            }
            for(j=0;j<2*i-1;j++)
            {
                System.out.print("DIAMOND");
            }
            System.out.println();
        }
        for(i=0;i<=7/2+1;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("       ");
            }
            for(k=0;k<(7-(2*i));k++)
            {
                System.out.print("DIAMOND");
            }
            System.out.println();
        }
    }
    

}