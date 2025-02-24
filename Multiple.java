import java.util.*;
class Multiple{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
			int pro = num * i;
			sum = sum + pro;
		}
		
		System.out.println("Sum = "+sum);
	}
	
}