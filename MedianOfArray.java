import java.util.*;
class MedianOfArray{
	public static void median(int arr[], int n)
	{
		Arrays.sort(arr);
		
		if(n%2 == 0)
		{
			int ind1 = n/2;
			int ind2 = (n/2)-1;
			
			 System.out.println((double)(arr[ind1]+arr[ind2])/2);
		}
		else{
			 
			System.out.println(arr[n/2]);
		}
		
	}
	
	public static void main(String args[])
	{
		int arr[] = {2,5,1,7};
		int n = arr.length;
		
		 median(arr, n);
	}
}