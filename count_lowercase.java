import java.util.*;
public class count_lowercase {


    public static int lowercount(String n)
    {
        int l=0;
        for(int i=1;i<=n.length();i++)
        {
            if(Character.isLowerCase(n.charAt(i-1)))
            {
                l++;
            }
        }

        return l;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Number of Lower case Charecters in the entered String is "+lowercount(name));

    }
    
}
