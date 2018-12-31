// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    private static long primeFact(long N)
    {
        long i=2;

        while(true)
        {
            while(N%i==0)
                N/=i;

            if(N==1)
                break;

            i++;
        }
        return i;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long N;

        N=Long.parseLong(br.readLine().trim());

        System.out.println(primeFact(N));
    }
}
