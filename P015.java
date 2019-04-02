// Created by akashbhalotia
import java.io.*;
import java.util.*;
class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,j,N=21;

        long grid[][]=new long[N][N];

        for(i=0;i<N;i++)
            grid[i][0]=1;

        for(i=0;i<N;i++)
            grid[0][i]=1;

        for(i=1;i<N;i++)
        {
            for(j=1;j<N;j++)
                grid[i][j]=grid[i][j-1]+grid[i-1][j];
        }
        System.out.println(grid[N-1][N-1]);
    }
}
