
import java.util.*;
public class Testing {
    public static List<Integer> perseArray(String input)
    {
        List<Integer> arr = new ArrayList<>();

        if(input.startsWith("[") && input.endsWith("]") || input.startsWith("{") && input.endsWith("}"))
        {
            input = input.substring(1, input.length()-1);
        }

        String tokens[] = input.split("[,\\s]+");
        for(String token:tokens)
        {
            arr.add(Integer.parseInt(token));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        List<Integer> list= perseArray(st);
        int[] arr = new int[list.size()];

        for(int i=0;i<list.size();i++)
        {
           arr[i] = list.get(i);
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}