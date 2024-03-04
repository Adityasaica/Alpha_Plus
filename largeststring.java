public class largeststring {


    public static void main(String args[])
    {
        //by lexicographic
        //we can use str1.compareTo(str2) function if output 0-equal  -ve str1<str2

        //compareTOIgnoreCase()


        String fruits[]={"apple","mango","kiwi","pineapple"};

        int l=fruits.length;

        String largest=fruits[0];
        for(int i=1;i<=l;i++)
        {
            if(largest.compareToIgnoreCase(fruits[i-1])<0)
            {
                largest=fruits[i-1];
            }

        }

        System.out.println(largest);



    }
    
}
