// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    private static int max(int a, int b){return (a>b)?a:b;}

    private static boolean isPalin(int N)
    {
        String s=N+"";
        int i=0,len=s.length();


        for (i = 0; i < len / 2; i++)
        {
            if (!(s.charAt(i) == s.charAt(len - i - 1)))
                    return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,j,m=0;

        for(i=999;i>=100;i--)
        {
            for(j=999;j>=100;j--)
            {
                if(isPalin(i*j))
                    m=max(m,i*j);
            }
        }
        System.out.println(m);
    }
}
