package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sep4Week_2003_Kse {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] numbers;
    static int N;
    static int M;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i ++) {
            int temp = 0;
            for (int j = i; j < N; j ++) {
                temp += numbers[j];
                if (temp == M) {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
