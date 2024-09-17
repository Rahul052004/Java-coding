/*Input
Num 1: 451
Num 2: 349
Output
2
Explanation:

Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10, again 1 is carried. Hence 2 is returned. */

import java.util.Scanner;

public class NumOfCarry {
    public static int countCarry(int  num1, int num2)
    {
        int temp1=num1;
        int temp2=num2;

        int count =0,rem=0;
        while(temp1 != 0 && temp2 != 0)
        {
            int d1=temp1%10;
            int d2=temp2%10;

            if((d1+d2+rem)>9)
            {
                count++;
                rem=(rem+d1+d2)/10;

            }
            temp1=temp1/10;
            temp2=temp2/10;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers :- ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println(countCarry(num1, num2));
        sc.close();
    }
}
