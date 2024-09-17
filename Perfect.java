import java.util.*;
class Perfect{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("Perfect Number :");
		}
		else
		{
			System.out.println("Not a Perfect Number :");
		}
	}
}

