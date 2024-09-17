 // reverse string
import java.util.*;
class Stringrev{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		 System.out.println(rev);
		sc.close();
	}
}
	