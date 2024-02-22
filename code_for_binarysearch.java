import java.util.*;
public class code_for_binarysearch {
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10,12,14,20,22};
        //binary search algorithm
        int l1=0;
        int l2=arr.length-1;
        Scanner scan=new Scanner(System.in);
        int f=scan.nextInt();
        int c=0;
        for(int i=1;i<=arr.length;i++)
        {
            int mid=(l1+l2)/2;
            if(f==arr[mid])
            {
                System.out.println("found at "+mid);
                c=1;
                break;
            }
            else if(f>arr[mid])
            {
                l1=mid;
            }
            else if(f<arr[mid])
            {
                l2=mid;
            }

        }
        if(c==0)
        {
            System.out.println("Not Found!");
        }
    }
}
