import java.util.*;
public class factorial {

    public static int factorial(int n)
    {
        if(n<0)
        {
            return -1;
        }
        else if(n==0)
        {
            return 0;
        }
        else
        {
            int p=1;
            for(int i=1;i<=n;i++)
            {
                p*=i;
            }
            return p;
        }

    }
    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("negative to break the loop else give any number:");
            Scanner sc=new Scanner(System.in);
            int j=sc.nextInt();
            if(j<0)
            {
                break;
            }
            else{
                System.out.println(factorial(j));
            }

        }
    }
    
}
