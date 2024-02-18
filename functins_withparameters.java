import java.util.*;
public class functins_withparameters {

    public static void calculatesum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of two numbers:"+sum);
        return;
    }
    public static int calsum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println("Hello world!");
        calculatesum();
        System.out.println(calsum(1,2));
        System.out.println(calsum(5,6));
    }
    
}
