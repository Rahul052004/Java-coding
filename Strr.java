import java.util.*;
class Strr{
    public static void main(String args[])
    {
        String st="ABC3456HG56";
        String st1="";

        for(int i=0;i<st.length();i++)
        {
            if(Character.isDigit(st.charAt(i))){
                st1=st1+i;
            }
        }
        System.out.println(st1);
    }
}