// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long i,j,ans=1,count=0;

        boolean isNotPrime[]=new boolean[1000000];

        for(i=2;i<1000000;i++)
        {
            if(isNotPrime[(int)i]==false)
            {
                count++;
                ans=i;

                if(count==10001)
                    break;
            }

            for(j=i*i;j<1000000;j+=i)
            {
                if(j<10000000)
                isNotPrime[(int)j] = true;
            }
        }

        System.out.println(ans);
    }
}
