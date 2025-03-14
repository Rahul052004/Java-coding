import java.io.*;
public class SumofCube {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n1 = br.readLine().trim();
        String n2 = br.readLine().trim();
        int m = Integer.parseInt(n1);
        int n = Integer.parseInt(n2);
        int sum = 0;
        for(int i=m;i<=n;i++)
        {
            sum = sum + (i*i*i);
        }

        System.out.println(sum);
    }
}
