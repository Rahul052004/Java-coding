import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,4,4,5,5};
        
        int count = 0;
        Arrays.sort(arr);

        int max=arr[arr.length-1];

        int secondLarge=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondLarge && arr[i]<max)
            {
                secondLarge=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==secondLarge)
            {
                count++;
            }
        }
        
        System.out.println(count);

    }
}
