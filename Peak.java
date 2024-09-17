public class Peak {
    public static int Findpeak(int arr[],int n)
    {
        if(n==0)
         return 0;
        if(arr[0]>arr[1])
         return arr[0];
        if(arr[n-1]>arr[n-2])
         return arr[n-1];
        
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>arr[i-1]&& arr[i]>arr[i+1])
             return arr[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={3,6};
        int n=arr.length;

        System.out.println("Peak element is:- "+Findpeak(arr,n));
    }
}
