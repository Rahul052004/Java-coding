public class ArrayRotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n = arr.length;
        int temp[] = new int[n];
        int d = 8;
        if(d >= n)
        {
            d = d % n;
        }

        for(int i=0;i<d;i++)
        {
            temp[i] = arr[i];
        }

        // Shifting

        for(int i=d; i<n;i++)
        {
            arr[i-d] = arr[i];
        }

        int j=0;
        for(int i=n-d;i<n;i++)
        {
            arr[i] = temp[j];
            j++;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }   
}
