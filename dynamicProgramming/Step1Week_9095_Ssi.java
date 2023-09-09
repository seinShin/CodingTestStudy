package dynamicProgramming;

import java.util.*;
import java.io.*;

public class Step1Week_9095_Ssi {

    static int[] dp;
    static int t;
    static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(bf.readLine());

        for(int k=0;k<t;k++){
            n = Integer.parseInt(bf.readLine());
            dp = new int[11];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for(int i=4;i<n+1;i++){
                dp[i]= dp[i-1]+dp[i-2]+dp[i-3];
            }
            System.out.println(dp[n]);
        }

    }
}
