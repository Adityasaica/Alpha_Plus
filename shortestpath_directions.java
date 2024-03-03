import java.util.*;

public class shortestpath_directions {

    public static void main(String args[])
    {
       

        String dir="WNEENESENNN";
        int x=0;
        int y=0;
        for(int i=1;i<=dir.length();i++)
        {
            if(dir.charAt(i-1)=='N')
            {
                y++;
            }
            if(dir.charAt(i-1)=='S')
            {
                y--;
            }
            if(dir.charAt(i-1)=='E')
            {
                x++;
            }
            if(dir.charAt(i-1)=='W')
            {
                x--;
            }
        }
        double xpow=x*x;
        double ypow=y*y;
        double res=Math.pow(xpow+ypow,0.5);
        System.out.println(res);

    }
    
}
