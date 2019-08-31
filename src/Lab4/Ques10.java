package Lab4;
import java.util.*;
public class Ques10 {
    public static void main(String args[])
    {
        int arr[] = {3,4,5,6,1,2};
        Arrays.sort(arr);
        for(int a:arr)
        System.out.println(a);
        System.out.println("Position: "+Arrays.binarySearch(arr,2));
        int arr2[] = Arrays.copyOf(arr, 4);
        for(int a:arr2)
        System.out.println(a);
    }
}
