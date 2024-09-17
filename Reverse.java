public class Reverse {
    public static void main(String[] args) {
        String st="ababa";
        boolean isPalin=true;
        int i,j;
        for( i=0,j=st.length()-1;i<=j;i++,j--)
        {
            if(st.charAt(i)!=st.charAt(j))
            {
                isPalin=false;
                break;
            }
            else{
                isPalin=true;
            }
        }

        if(isPalin==true)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
       
    }
}
