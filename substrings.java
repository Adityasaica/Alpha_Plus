public class substrings {
    public static String substring1(String st,int s,int e)
    {
        String substr="";
        for(int i=s;i<=e-1;i++)
        {
            substr=substr+st.charAt(i);
        }

        return substr;
    }
    public static void main(String args[])
    {
        String str="Hello World";
        System.out.println(substring1(str,0,5));

        System.out.println(str.substring(0,5));


    }
    
}
