public class binarytodecimal {

    public static void bintodec(int n)
    {
        int dec=0;
        int count=0;
        while(n>0)
        {
            int lc=n%10;
            dec=dec+(lc*(int)Math.pow(2,count));
            count++;
            n=n/10;


        }
        System.out.println("Decimal number is "+dec);

    }

    public static void main(String args[])
    {
        bintodec(1011);
    }
    
}
