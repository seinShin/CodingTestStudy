package dynamicProgramming;

import java.util.*;
import java.io.*;
public class Sep1Week_2579_Ssi {
    static int[] arr = new int[301];
    static int[] dp = new int[301];
    static int n;
    static int tmp;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n=Integer.parseInt(bf.readLine());

        for(int i=0; i<n; i++){
            tmp = Integer.parseInt(bf.readLine());
            arr[i] = tmp;
        }

        dp[0] = arr[0];
        dp[1] = arr[0]+arr[1];
        dp[2] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);

        for(int i=3; i<n; i++){
            dp[i] = Math.max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i]);
        }

        System.out.println(dp[n-1]);
    }

}
