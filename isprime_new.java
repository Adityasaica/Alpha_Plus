import java.util.*;

public class isprime_new {

    public static boolean isprime(int n)
    {
        boolean isp=true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                isp=false;

            }
        }

        return isp;

    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a;
        a=sc.nextInt();
        System.out.println(isprime(a));
    }
    
}
