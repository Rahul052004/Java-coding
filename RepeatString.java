/*Input
 * 3
 * abc
 * 
 * output
 * abcabcabc
 */
import java.util.Scanner;
public class RepeatString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range :- ");
        int n=sc.nextInt();
        System.out.println("Enter the string :- ");
        String st=sc.next();

        String res="";
        for(int i=0;i<n;i++)
        {
            res=res+st;
        }
        System.out.println(res);
        sc.close();
    }
}
