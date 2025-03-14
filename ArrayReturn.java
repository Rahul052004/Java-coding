import java.util.*;
public class ArrayReturn {
    public static int[] readArray(Scanner sc)
    {
        String str[] = sc.nextLine().split("\\s+");
        int arr[] = new int[str.length];

        for(int i=0;i<str.length;i++)
        {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = readArray(sc);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }

    }
}
