public class LengthOfLast {
    public static void main(String[] args) {
        String st="I am Rahul";
        String s=st.trim();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                count=0;
            }

            else{
                count++;
            }
        }

        System.out.println("Length of last word is "+count);
    }
}
