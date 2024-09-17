import java.util.*;
class Rat{
	public static int food(int u, int r, int arr[],int n)
	{
		if(n==0)
			return -1;
		int res= r*u;
		int  sum=0;
		int  count=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			count++;
			if(sum>=res)
				break;
		}
		if(sum<res)
			return 0;
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt ();
		int unit = sc.nextInt ();
		int n = sc.nextInt ();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt ();
		System.out.println (food(r, unit, arr, n));
	}
}
		