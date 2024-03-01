public class assesment_array_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        int newarr[]=new int[nums.length];
        int d=0;
        for(int i=1;i<=nums.length;i++)
        {
            
            for(int j=0;j<=d;j++)
            {
                if(nums[i-1]==newarr[j])
                {
                    return true;
                }
            }
            newarr[d]=nums[i-1];
            d++;
        }
        return false;
        
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,1};
        System.out.println(containsDuplicate(arr));

    }
    
    
}
