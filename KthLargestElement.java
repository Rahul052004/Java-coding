import java.util.*;
public class KthLargestElement {
    public static int[] perseArray(String input)
    {
        if(input.startsWith("[") && input.endsWith("]") ||input.startsWith("{") && input.endsWith("}") )
        {
            input = input.substring(1, input.length()-1);
        }

        String tokens[] = input.split("[,\\s]+");
        int arr[] = new int[tokens.length];
        int index = 0;
        for(String token:tokens)
        {
            arr[index] = Integer.parseInt(token);
            index++;
        } 
        return arr; 
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int k = sc.nextInt();

        int arr[] = perseArray(st);
        
        int n = arr.length;
        Arrays.sort(arr);

        System.out.println(arr[n-k]);

        sc.close();

    }
}
