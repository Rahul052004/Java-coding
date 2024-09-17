public class StringReplace {
    public static void main(String[] args) {
        String st="appleaapp";
        char ch1='a';
        char ch2='p';
        String s="";
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)==ch1)
            {
               s=s+ch2;
            }

            else if(st.charAt(i)==ch2)
            {
                s=s+ch1;
            }
            else
            {
                s=s+st.charAt(i);
            }
        }

        System.out.println(s);
    }
}
