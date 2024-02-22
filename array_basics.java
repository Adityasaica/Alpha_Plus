import java.util.*;
public class array_basics {

    public static void main(String args[])
    {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        System.out.println("first number:"+arr[0]);
        System.out.println("second number:"+arr[1]);
        System.out.println("third number:"+arr[2]);
        arr[2]=arr[2]+10;
        System.out.println("updated third number:"+arr[2]);
        
    }
    
}
