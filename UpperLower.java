import java.util.*;
class UpperLower{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int lc=0;
		int uc=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=65 && ch<=90)
			{
				uc++;
			}
			if(ch>=97 && ch<=122)
			{
				lc++;
			}
		}
		if(uc>lc)
		{
			st=st.toUpperCase();
			System.out.println(st);
		}
		else
		{
			st=st.toLowerCase();
			System.out.println(st);
		}
	}
}