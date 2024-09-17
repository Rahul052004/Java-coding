import java.util.Stack;

public class Decitoby {
     public static String decitoby(int n)
    {
        if(n == 0)
        {
            return "0";
        }
        
        if(n == 1)
        {
            return "1";
        }
        Stack<Integer> stk=new Stack<>();

        while(n>0)
        {
            int rem=n%2;
            stk.push(rem);
            n=n/2;
        }

        StringBuilder st=new StringBuilder();

        while(!stk.isEmpty())
        {
            st.append(stk.pop());
        }
        return st.toString();
    }

    public static void main(String[] args) {
        System.out.println("The binary form will be "+decitoby(10));
    }
}
