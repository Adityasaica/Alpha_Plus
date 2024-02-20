public class function_assesment_iseven {
    

    public static boolean iseven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        System.out.println(iseven(2));
        System.out.println(iseven(3));
    }
}
