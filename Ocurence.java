import java.util.*;
public class Ocurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,5,5,5,6,6,6,6,7};
        Arrays.sort(arr);

        int largest=arr[arr.length-1];

        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondLargest && arr[i]<largest)
            {
                secondLargest=arr[i];
            }
        }
        
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==secondLargest)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
