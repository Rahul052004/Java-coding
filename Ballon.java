import java.util.*;
public class Ballon {
    public static char[] perseArr(String input)
    {
        if(input.startsWith("[") && input.endsWith("]") || input.startsWith("{") && input.endsWith("}"))
        {
            input = input.substring(1, input.length()-1);
        }
        String tokens[] = input.split("[,\\s]+");
        StringBuilder str = new StringBuilder();
        for(String s:tokens)
        {
            str.append(s);
        }
      
        return str.toString().toCharArray() ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        char arr[] = perseArr(st);
        char ans = 0;
        HashMap<Character,Integer> map =  new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(char ch:arr)
        {
            if(map.get(ch)%2 !=0)
            {
                ans = ch;
                break;
            }
        }
        if(ans ==0)
        {
            System.out.println("All are even");
        }
        else{
            System.out.println(ans);
        }
        sc.close();
        
    }
}
