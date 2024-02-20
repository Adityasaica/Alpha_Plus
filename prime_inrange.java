import java.util.*;
public class prime_inrange {

    public static boolean isprime(int n)
    {
        if(n==2)
        {
            return true;
        }
        else{
            for(int i=2;i<=n-1;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int j=2;j<=a;j++)
        {
            if(isprime(j)==true)
            {
                System.out.println(j);
            }
        }
    }
    
}
