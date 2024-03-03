import java.util.*;

public class palindrome_stiring {

    public static boolean palindrome(String name)
    {
        
        int l=name.length();
        int c=0;
        for(int i=1;i<=name.length()/2;i++)
        {
            if(name.charAt(i-1)==name.charAt(l-i))
            {
                c++;

            }
        }
        if(c==l/2)
        {
            return true;
        }
        else{
            return false;
        }
       
    }

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        String sample=sc.next();
        System.out.println("the above claim for palindrome is "+palindrome(sample));

    }
    
}
