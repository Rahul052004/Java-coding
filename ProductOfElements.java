public class ProductOfElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int array[]=new int[arr.length];
        array[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            array[i]=array[i-1]*arr[i];
        }

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
