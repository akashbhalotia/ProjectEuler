// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=1000000,count=0,len,tmp;
        long i,j;

        boolean prime[]=new boolean[N];
        Arrays.fill(prime,true);

        prime[1]=false;

        Queue<Integer> Q=new LinkedList<>();

        for(i=2;i<N;i++)
        {
            if(prime[(int)i]==true)
            {
                Q.add((int)i);

                for(j=i*i;j<N;j+=i)
                    prime[(int)j]=false;
            }
        }

        int pow[]={1,10,100,1000,10000,100000,1000000};

        while(!Q.isEmpty())
        {
            N=Q.poll();
            len=(N+"").length();

            for(i=1;i<=len;i++)
            {
                tmp=N/pow[len-1];
                N=N%pow[len-1]*10;
                N+=tmp;

                if(!prime[N])
                    break;
            }

            if(i==len+1)
                count++;
        }

        System.out.println(count);
    }
}
