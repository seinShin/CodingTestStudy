package dynamicProgramming;

import java.util.*;
import java.io.*;
public class Sep1Week_1912_Ssi {

    static int[] arr;
    static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(bf.readLine());

        arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<n;i++){
            arr[i] = Math.max(arr[i], arr[i]+arr[i-1]);
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
