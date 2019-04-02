// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long i,N=1001,sum=1;

        for(i=3;i<=N;i+=2)
        {
            sum+=i*i*4-6*(i-1);
        }
        System.out.println(sum);
    }
}
