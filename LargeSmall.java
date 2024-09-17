import java.util.*;
public class LargeSmall {
    public static int computeSum(int arr[])
    {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();

        if(arr.length<=3)
        {
            return 0;
        }

        even.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(i%2==0)
            {
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);

        return even.get(even.size()-2) + odd.get(odd.size()-2);

    }

    public static void main(String[] args) {
        int arr[]={1, 8, 0, 2, 3, 5, 6};

        System.out.println(computeSum(arr));
    }
}
