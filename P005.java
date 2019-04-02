// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    private static long GCD(long a, long b)
    {
        if (a == 0)
            return b;

        return GCD(b % a, a);
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;
        long LCM=1;

        for(i=1;i<=20;i++)
        {
            LCM=LCM*i/GCD(LCM,i);
        }
        System.out.println(LCM);
    }
}
