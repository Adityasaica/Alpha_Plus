import java.util.*;
public class isprime {

    public static boolean isprime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter the number to find the isprime:");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(isprime(n));
    }
    
}
