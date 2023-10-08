package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sep4Week_7568_Ssi {
    static int n;
    static int [][] arr;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        arr = new int[n][2];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            k=1;
            for(int j=0; j<n; j++){
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    k++;
                }
            }

            System.out.print(k+ " ");
        }
    }
}
