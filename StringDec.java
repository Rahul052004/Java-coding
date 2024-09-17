public class StringDec{
    public static String decode(String s)
    {
        String ans="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
            else{
                ans=ans+(char)(64+count);
                count=0;
            }
        }

        if(count>0)
        {
            ans=ans+(char)(64+count);
        }
        return ans;
    }

    public static void main(String[] args) {
        String st="10110111";
        System.out.println(decode(st));
    }
}
