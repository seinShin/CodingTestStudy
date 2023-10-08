package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sep4Week_2003_Ssi {
    static int n;
    static int m;
    static int left;
    static int right;
    static int sum;
    static int cnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr=new int[n];
        st = new StringTokenizer(bf.readLine());

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        left=0;
        right=1;
        sum=arr[0];
        cnt=0;

        while(true){
            if(sum < m){
                if(right< n){
                    sum += arr[right];
                    right++;
                }else{
                    break;
                }
            }else if(sum == m){
                cnt++;
                sum-=arr[left];
                left++;
            }else{
                sum-=arr[left];
                left++;
            }
        }

        System.out.println(cnt);


    }
}
