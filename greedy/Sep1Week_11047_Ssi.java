package greedy;

import java.io.*;
import java.util.*;

public class Sep1Week_11047_Ssi {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];



        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(bf.readLine());
        }

        int min =0;
        for(int i=n-1; i>=0;i--){
            if(arr[i] <= k){
                min += (k/arr[i]);
                k = k % arr[i];
            }
        }

        System.out.print(min);
    }

}
