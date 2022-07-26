import java.util.Arrays;
import java.util.Collections;
 
class FourthSmallest {
    public static int kthSmallest(Integer[] arr,int k)
    {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 13, 15, 7, 19 };
        int k = 4;
        System.out.print("4th smallest element is " + kthSmallest(arr, k));
    }
}
 
