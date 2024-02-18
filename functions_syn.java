public class functions_syn {
    
    public static void print()
    {
        System.out.println("Hello World! from function");
        return;
    }
    public static void main(String args[])
    {
        //main was a reserved word
        //args means an array
        //void was the return type
        //which must be a void i.e nothing
        System.out.println("Helo world! from main!");
        print();
        print();
        for(int i=1;i<=10;i++)
        {
            print();
        }
    }
}
