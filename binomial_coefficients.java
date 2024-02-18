import java.util.*;
public class binomial_coefficients {

    public static int factorial(int a)
    {
        if(a==0)
        {
            return 1;
        }
        else{
            int p=1;
            for(int j=1;j<=a;j++)
            {
                p=p*j;
            }
           
            return p;
            
        }
    }
    public static float bincoeff(int n,int r)
    {
        
        float res=factorial(n)/(factorial(r)*factorial(n-r));
        return res;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n and r:");
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("the binomial coeff was "+bincoeff(n,r));



    }
    
}
