public class array_pass_attribute {

    public static void increment(int arr1[])
    {
        for(int i=1;i<=arr1.length;i++)
        {
            arr1[i-1]+=1;

        }
    }
    public static void main(String args[])
    {
        int arr[]={90,91,92};
        increment(arr);
        for(int j=1;j<=arr.length;j++)
        {
            System.out.println(arr[j-1]);

        }

    }
}
