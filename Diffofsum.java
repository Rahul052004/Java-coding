import java.util.*;
class Diffofsum{
		public static int dofsum(int n, int m)
		{
			int sum1=0;
			int sum2=0;
			for(int i=1;i<=m;i++)
			{
				if(i%n==0)
				{
					sum1=sum1+i;
				}
				else{
					sum2=sum2+i;
					}
			}
			return (sum2=sum1);
		}
		
		public static void main(String args[])
		{
			System.out.println(dofsum(4,20));
		}
}
	
			
			