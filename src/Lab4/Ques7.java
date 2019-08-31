/*
 * Find maximum and minimum number using recursion in an array.
 */
package Lab4;
public class Ques7 {
    public static void main(String args[])
    {
        int a[] = {2,44,66,3,5,88,77,56,73,45};
        max(a,1,a[0]);
        min(a,1,a[0]);
    }

    private static void max(int[] a, int pos, int maxElement) {
        if(pos==10)
            System.out.println("Max Element is:"+maxElement);
        else
        {
            if(a[pos]>maxElement)
                maxElement=a[pos];
            max(a,++pos,maxElement);
        }
    }
    
    private static void min(int[] a, int pos, int minElement) {
        if(pos==10)
            System.out.println("Min Element is:"+minElement);
        else
        {
            if(a[pos]<minElement)
                minElement=a[pos];
            max(a,++pos,minElement);
        }
    }
}
