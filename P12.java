// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    private static int count(int N)
    {
        int c=1,tmp,i=2;

        while(true)
        {
            tmp=1;
            while(N%i==0)
            {
                N/=i;
                tmp++;
            }

            c*=tmp;

            if(N==1)
                break;

            i++;
        }

        return c;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N,d=2;

        for(i=1;;i+=d++)
        {
            if(count(i)>500)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
