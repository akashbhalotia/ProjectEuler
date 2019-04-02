// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,j,N;

        int dp[]=new int[205];
        int val[]={1,2,5,10,20,50,100,200};

        dp[0]=1;

        for(i=0;i<8;i++)
        {
            for(j=val[i];j<=200;j++)
                dp[j]+=dp[j-val[i]];
        }

        System.out.println(dp[200]);
    }
}
