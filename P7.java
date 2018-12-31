// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long i,j,ans=1,count=0;
        int N=1000000;

        boolean isNotPrime[]=new boolean[N];

        for(i=2;i<N;i++)
        {
            if(isNotPrime[(int)i]==false)
            {
                count++;
                ans=i;

                if(count==10001)
                    break;

                for(j=i*i;j<N;j+=i)
                {
                    isNotPrime[(int) j] = true;
                }
            }
        }

        System.out.println(ans);
    }
}
