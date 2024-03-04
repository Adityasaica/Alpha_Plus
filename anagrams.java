import java.util.*;
public class anagrams {


   

    public static boolean isanagrams(String fir,String sec)
    {
        int l=0;
        int arr[]=new int[fir.length()];
        int d=0;
        for(int i=1;i<=fir.length();i++)
        {
            for(int j=1;j<=sec.length();j++)
            {
                if(fir.charAt(i-1)==sec.charAt(j-1))
                {
                   
                        
                    arr[d]=j-1;
                    d++;
                    l++;
                    
                    
                }
            }
        }
        System.out.println(l);
        if(l==fir.length())
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
        String fir=sc.next();
        String sec=sc.next();
        System.out.println(isanagrams(fir,sec));
    }
    
}
