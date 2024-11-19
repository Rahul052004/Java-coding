import java.util.*;
public class OccurenceOfElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,1,3,5,6,4,1,2,3,5};

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

        for(int i:occur.keySet())
        {
            System.out.println("Element :- "+ i +" occurence:- "+ occur.get(i));
        }

    }
}
