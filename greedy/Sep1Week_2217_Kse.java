package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sep1Week_2217_Kse {

    /**
     * k 개의 로프를 사용할 대 로프는 모두 고르게 w/k 만큼의 중량이 걸린다.
     * 즉, 어떤 로프를 쓰든 로프가 버틸수 있는 최대 하중 중 최소인 것의 중량을 따른다.
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] weights;
    static int idx;
    static int temp;
    static int max;

    public static void main (String[] args ) throws IOException {
        N = Integer.parseInt(br.readLine());
        weights = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(weights);

        idx = N - 1;
        max = 0;
        temp = 0;

        for (int i = 1; i <= N; i ++) {
            temp = weights[idx--] * i;

            if(max < temp){
                max = temp;
            }
        }

        System.out.println(max);
    }
}
