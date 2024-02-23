public class kadans_algorithm {
    public static void kandane(int arr[])
    {
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int l=arr.length;
        int res[]=new int[l];
        int p=0;
        for(int i=1;i<=l;i++)
        {
            
            current_sum=current_sum+arr[i-1];
            if(current_sum<0)
            {
                current_sum=0;
            }
            if(max_sum<current_sum)
            {
                max_sum=current_sum;
                res[p]=i-1;
                
                p++;
                
            }
            System.out.print(current_sum);
            System.out.print(' ');
            System.out.println(max_sum);
            



        }
        System.out.println("between indexes:");
        System.out.println(res[p-1]+" "+res[p-2]);
    }
    public static void main(String args[])
    {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kandane(arr);

    }
}
