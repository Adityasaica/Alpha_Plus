public class java_improved_linearsearch {
    
    public static int linearsearch(int arr[],int f)
    {
        for(int i=1;i<=arr.length;i++)
        {
            if(arr[i-1]==f)
            {
                return i-1;
            }

        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,10,32,56};
        if(linearsearch(arr,56)!=-1)
        {
            System.out.println("Element was found at "+linearsearch(arr,56)+" index");
        }

    }
}
