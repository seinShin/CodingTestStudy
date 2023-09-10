package greedy;

import java.util.*;
import java.io.*;

public class Sep1Week_2217_Ssi {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bf.readLine());
        Integer[] arr = new Integer[n];

        for(int i=0; i<n;i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.asList(arr);
        Arrays.sort(arr, Comparator.reverseOrder());

        int max=0;
        for(int i=0; i<n;i++){
            int tmp = arr[i] * (i+1);
            if(max < tmp){
                max = tmp;
            }
        }

        System.out.println(max);
    }
}
