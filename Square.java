public class Square {
    public static int checkSq(int arr[])
    {
        double sq;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            sq=Math.sqrt(arr[i]);
            if(Math.ceil(sq)==Math.floor(sq))
             c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int arr[]={64,16,38,81,50,100};
        System.out.println("No. of suqared place:- "+checkSq(arr));
    }
}
