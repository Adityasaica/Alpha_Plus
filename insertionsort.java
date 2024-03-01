public class insertionsort {

    public static void insert(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {

            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
            
        }
    }

    public static void main(String args[])
    {
        int arr[]={5,4,1,3,2};
        insert(arr);
        for(int k=1;k<=arr.length;k++)
        {
            System.out.println(arr[k-1]);
        }


    }
    
}
