public class functions_palindrome {
    
    public static boolean ispalindrome(int n)
    {
        int arr[]=new int[10];
        
        int c=0;
        while(n>0)
        {
            arr[c]=n%10;
            n=n/10;
            c++;
        }
        
        int l=0;
        for(int i=1;i<=c;i++)
        {
            if(arr[i-1]==arr[c-i])
            {
                l++;
            }

        }
        if(c==l)
        {
            return true;
        }
        else{
            return false;
        }
        
       
        
    }

    public static void main(String args[])
    {
        System.out.println(ispalindrome(12321));
    }
}
