public class java_assesment_sumofdigits {

    public static int sumdig(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println(sumdig(134064056));
    }
}
