package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sep4Week_20937_Ssi {
    static int n;
    static int[] arr;
    static int[] numbers = new int[500001];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(bf.readLine());
        arr = new int[n];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i : arr){
            numbers[i]+=1;
        }

        System.out.println(Arrays.stream(numbers).max().getAsInt());
    }
}
