public class BinarySearch {
    public static void binarySearch(int arr[], int first, int last, int key)
    {
        int mid=(first+last)/2;

        while(first<=last)
        {
            if(arr[mid]==key)
            {
                System.out.println("Element found at index "+mid);
                break;
            }

            else if(key>mid)
            {
                first=mid+1;
            }

            else{
                last=mid-1;
            }

            mid=(first+last)/2;
        }

        if(first>last)
        {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int arr[]={10,15,20,25,30,35,40};
        int last=arr.length-1;
        int key=25;

        binarySearch(arr, 0, last, key);
    }

}
