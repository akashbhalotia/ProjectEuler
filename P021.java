// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    private static int sumOfFact(int N)
    {
        int i,sum=1,sqrt=(int)Math.sqrt(N);

        for(i=2;i<=sqrt;i++)
        {
            if(N%i==0)
            {
                sum += i;

                if (i * i != N)
                    sum += N / i;
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N=10000;
        long sum=0;

        int dp[]=new int[10005];

        for(i=1;i<N;i++)
        {
            if(dp[i]==0)
                dp[i]=sumOfFact(i);

            if(dp[i]==i||dp[i]<i||dp[i]>=10000)
                continue;

            if(dp[dp[i]]==0)
                dp[dp[i]]=sumOfFact(dp[i]);

            if(dp[dp[i]]==i)
                sum+=i+dp[i];

        }
        System.out.println(sum);
    }
}
