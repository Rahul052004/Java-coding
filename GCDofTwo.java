import java.util.*;
class GCDofTwo{
    public static int gcd(int a , int b){
        int result = Math.min(a, b);

        while(result>0){
            if(a % result ==0 && b% result == 0){
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(gcd(n1, n2));
        sc.close();
    }
}