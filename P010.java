// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=2000000;
        long i,j,sum=0;

        boolean notPrime[]=new boolean[N];

        for(i=2;i<N;i++)
        {
            if(!notPrime[(int)i])
            {
                sum+=i;

                for(j=i*i;j<N;j+=i)
                    notPrime[(int)j]=true;
            }
        }
        System.out.println(sum);
    }
}
