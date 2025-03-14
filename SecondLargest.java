public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {5,5,5,5,5,5,4};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
           max = Math.max(max, arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<max && arr[i] > second)
            {
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(second);
        }
    }
}
