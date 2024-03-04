public class compare_string {

    public static void main(String args[])
    {
        String s1="Tony Stark";
        String s2="Tony Stark";
        String s3=new String("Tony Stark");


        if(s1==s2)
        {
            System.out.println("Strings were equal");
        }
        else{
            System.out.println("Strings were not equal");

        }

        if(s1==s3)
        {
            System.out.println("Strings were equal");
        }
        else{
            System.out.println("Strings were not equal");
        }

        //imp in java if you create a same string without new keyword your variable will point to the same string but if you use new word it will create new space that cannot be equal

        //to check the proper
        if(s1.equals(s2))
        {
            System.out.println("equal");
        }
        if(s1.equals(s3))
        {
            System.out.println("equal");
        }
    }
    
}
