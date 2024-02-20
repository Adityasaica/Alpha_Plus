public class decimaltobin {

    public static int dectobin(int n)
    {
        int bin=0;
        int c=0;
        while(n>0)
        {
            bin=bin+((n%2)*(int)Math.pow(10,c));
            c++;
            n=n/2;
        }
        return bin;
    }

    public static void main(String args[])
    {
        System.out.println(dectobin(9));
    }
    
}
