public class GooglyPrime {
    public static boolean isPrime(int n)
    {
        if(n == 0 || n == 1){
            return true;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void googly(int n)
    {
        int sum=0;
        while (n>0){
            int d=n%10;
            sum=sum+d;
            n=n/10;   
        }

        if(isPrime(sum))
        {
            System.out.println("Googly Prime");
        }
        else{
            System.out.println("Not Googly Prime");
        }
    }

    public static void main(String[] args) {
        int n=1235;

        googly(n);
    }
}
