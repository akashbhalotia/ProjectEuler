// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;
        long s1=0,s2=0;

        for(i=1;i<=100;i++)
        {
            s1+=i*i;
            s2+=i;
        }
        s2*=s2;
        System.out.println(s2-s1);
    }
}
