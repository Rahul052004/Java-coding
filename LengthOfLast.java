public class LengthOfLast {
    public static void main(String[] args) {
        String st="I am Kumarrrrr";
        String s=st.trim();
        String str[] = st.split("\\s+");
        int count = 0;
        String last = str[str.length-1];
        count = last.length();

        System.out.println("Length of last word is "+count);
    }
}
