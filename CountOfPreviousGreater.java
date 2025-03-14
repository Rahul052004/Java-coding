import java.util.*;
public class CountOfPreviousGreater {
    public static int[] perseArray(String input)
    {
        if(input.startsWith("[") && input.endsWith("]") || input.startsWith("{") && input.endsWith("}"))
        {
            input = input.substring(1, input.length()-1);
        }
        String tokens[] = input.split("[,\\s]+");

        int arr[] = new int[input.length()];
        int index = 0;
        for(String st:tokens)
        {
            arr[index]= Integer.parseInt(st);
            index++;
        }
        return Arrays.copyOf(arr,index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String st = sc.nextLine();
        int arr[] = perseArray(st);
        int count = 1;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
