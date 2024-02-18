import java.util.*;
public class swap_numbers {

    public static void swap(char a,char b)
    {
        char t=a;
        a=b;
        b=t;
        System.out.println("after swapping "+a+' '+b);
        return;

    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        swap(a,b);




    }
    
}
