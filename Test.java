import java.util.*;
public class Test {
  public static void main(String[] args) {
    int arr[]={21,24,67,13,24,27};
    int a[]=new int[arr.length];
    int sum=0;
    for(int i=arr.length-1;i>=0;i--)
    {
      a[i]=arr[i];
        // if((i+1)%2==0)
        // {
        //     sum=sum+arr[i];
        // }
    }
    for(int j=0;j<a.length;j++)
    {
      if((j+1)%2==0)
      {
        sum=sum+a[j];
      }
    }
    System.out.println(sum);

  }
}
