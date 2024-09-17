public class Bubble {
    public static void bubSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={5,6,3,4,2,9,1};
        System.out.println("Before Sort:- ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubSort(arr);

        System.out.println("After Sort:- ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
