/*The function def ProductSmallestPair(sum, arr) accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair */
import java.util.*;
public class SmallestPair {
    public static int proSmall(int arr[], int sum)
    {
        if(arr.length == 0)
        {
            return 0;
        }
        Arrays.sort(arr);
        if(arr[0]+arr[1]<=sum)
        {
            return (arr[0] * arr[1]);
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[]={9, 8, 3, -7, 3, 9};
        int sum=4;

        System.out.println(proSmall(arr, sum));
    }
}
