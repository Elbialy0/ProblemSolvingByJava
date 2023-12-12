package Codeforces;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class line {
     public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-->0)
        {
            int n = in.nextInt();
            in.nextLine();
            String str = in.next();
            char [] arr = str.toCharArray();
            int [] score = new  int[n];
            int index=0;
            long ans=0;
            for(char a :arr)
            {
                if(a=='L')score[index]=index;
                else score[index]=n-index-1;
                ans+=score[index];
                index++;


            }
            int counter=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]=='R')
                {
                    if(score[i]<i)
                    {

                        score[i]=i-score[i];

                    }
                    else score[i]=0;

                }
                else
                {
                    if(score[i]<(n-i-1))
                    {
                       score[i]=(n-i-1)-score[i];

                    }
                    else score[i]=0;

                }
            }
            Arrays.sort(score);
            for(int i=0;i<n;i++)
            {
                if(score[n-i-1]!=0)
                {
                    ans+=score[n-i-1];
                    System.out.print(ans+" ");
                }
                else System.out.print(ans+" ");
            }
            System.out.println();

        }


    }
    
}
