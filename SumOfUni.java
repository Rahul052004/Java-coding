import java.util.*;
class SumOfUni{
	public static void main(String args[])
	{
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		for(int num:set)
		{
			sum = sum + num;
		}
		
		System.out.println(sum);
	}
}