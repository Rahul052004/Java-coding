public class Stairs {
    public static int maxStrair(int n,int m)
    {
        return ((n/m)+(n%m));
    }

    public static void main(String[] args) {
        System.out.println(maxStrair(10, 3));
    }
}
