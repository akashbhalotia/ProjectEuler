// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N,sum=0;

        N=1000;

        for(i=1;i<N;i++)
        {
            if(i%3==0||i%5==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
