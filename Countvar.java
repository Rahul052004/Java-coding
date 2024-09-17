// No of a in the string

import java.util.*;
class Countvar{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a word");
		String st=sc.next();
		char ch='a';
		int len=st.length();
		int c=0;
		for(int i=0;i<len;i++)
		{
			if(st.charAt(i)== ch)
			{
				c++;	
			}
			
		}
		sc.close();
		System.out.println(c);
	}
}