import java.util.*;
public class LongestCommonPrefix {
    public static String[] perseArr(String input)
    {
        if(input.startsWith("[") && input.endsWith("]") || input.startsWith("{") && input.endsWith("}"))
        {
            input = input.substring(1, input.length()-1);
        }
        String tokens[] = input.split("[,\\s]+");
        
      
        return tokens ;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        String st =  sc.nextLine();

        String arr[] = perseArr(st);

        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length-1];
        String ans = "";

        for(int i=0;i<first.length();i++)
        {
            if(first.charAt(i) != last.charAt(i))
            {
                break;
            }
            else{
                ans = ans+first.charAt(i);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
