public class trapping_rainwater 
{
    public static void rainwater(int arr[])
    {
        //first we have to start to calculate 
        //left max and right max 
        //auxillary array

        int leftmax[]=new int[arr.length];
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }

        int rightmax[]=new int[arr.length];
        rightmax[arr.length-1]=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        int trapped=0;
        for(int j=1;j<=arr.length;j++)
        {
            int waterlevel=Math.min(leftmax[j-1],rightmax[j-1]);
            int diff=waterlevel-arr[j-1];
            if(diff>0)
            {
                trapped+=diff;
            }

        }
        System.out.println(trapped);


    }
    public static void main(String args[])
    {
        int arr[]={4,2,0,6,3,2,5};
        rainwater(arr);
    }
    
}
