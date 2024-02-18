import java.util.*;
public class product {

    public static int product()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num:");
        int a=sc.nextInt();
        System.out.println("Enter the second num:");
        int b=sc.nextInt();

        return a*b;


    }
    public static void main(String args[])
    {
        int prod=product();
        System.out.println("The product of two numbers: "+prod);
    }
    
}
