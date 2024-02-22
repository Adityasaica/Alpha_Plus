public class find_max_subarray {

    public static void extremesubarray(int arr[])
    {
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                int currsum=0;
                for(int k=i;k<=j;k++)
                {
                    currsum+=arr[k];

                }
                if(currsum>maxsum)
                {
                    maxsum=currsum;
                }
                if(currsum<minsum)
                {
                    minsum=currsum;
                }
                System.out.println(currsum);

            }
            

        }
        System.out.println("max sum: "+maxsum);
        System.out.println("min sum:"+minsum);
    }
    public static void main(String args[])
    {

        int arr[]={1,2,5,4,8};
        extremesubarray(arr);

    }
    
}
