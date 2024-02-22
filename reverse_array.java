public class reverse_array {


    public static void reverse(int arr[])
    {
        int first=0;
        int last=arr.length-1;
        while(first<last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }

    }
    public static void main(String args[])
    {
        int arr[]={1,3,6,7,9,10};
        reverse(arr);
        for(int i=1;i<=arr.length;i++)
        {
            System.out.println(arr[i-1]);
        }
    }
    
}
