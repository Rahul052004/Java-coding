import java.util.Scanner;
public class RearBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n=sc.nextInt();

        int count=0;
        while(n>0)
        {
            if((n&1)==1)
            {
                count++;
            }
            n=n>>1;
        }

        double ans=0;
        for(int i=0;i<count;i++)
        {
            ans=ans+Math.pow(2, i);
        }

        System.out.println((int)ans);
    }
}
