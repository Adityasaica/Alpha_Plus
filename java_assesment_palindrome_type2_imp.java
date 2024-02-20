import java.util.*;
public class java_assesment_palindrome_type2_imp {


    public static boolean ispalindrome(int n)
    {
        int n1=n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==n1)
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[])
    {
        System.out.println(ispalindrome(121213));
        System.out.println(ispalindrome(12121));

    }
    
}
