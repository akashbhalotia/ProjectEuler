// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,a=1,b=1,c=a+b,sum=0;

        while(c<=4000000)
        {
            if((c&1)==0)
                sum+=c;

            a=b;
            b=c;
            c=a+b;
        }
        
        System.out.println(sum);
    }
}
