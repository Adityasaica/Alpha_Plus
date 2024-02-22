public class java_maximum_number_minimumnumber_array {

    public static void extremes(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=1;i<=arr.length;i++)
        {
            if(arr[i-1]>largest)
            {
                largest=arr[i-1];
            }
            if(arr[i-1]<smallest)
            {
                smallest=arr[i-1];
            }
        }
        System.out.println("Largest number: "+largest);
        System.out.println("Smalles number: "+smallest);
    }
    public static void main(String args[])
    {
        int arr[]={3,4,6,2,78,-3};
        extremes(arr);

    }
}
