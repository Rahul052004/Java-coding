import java.util.*;
public class EachEleOccur {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,6,6,5,5,5,8,8,8,8,7};

        HashMap<Integer,Integer> occur=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(occur.containsKey(arr[i]))
            {
                occur.put(arr[i],occur.get(arr[i])+1);            
            }

            else{
                occur.put(arr[i],1);
            }
        }

        for(int i: occur.keySet())
        {
            System.out.println(i+" --> "+occur.get(i));
        }
    }
}
