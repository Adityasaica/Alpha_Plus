import java.util.*;
public class java_linear_search {

    public static void main(String args[])
    {
        System.out.println("Enter the Number of Elements:");
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();

        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=scan.nextInt();
        }
        System.out.println("Enter the element to be found:");
        int f=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(arr[i-1]==f)
            {
                System.out.println("Number found");
                break;

            }
            else if(i==n)
            {
                System.out.println("Not found");
            }
            
        }

    }
    
}
