package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sep1Week_1026_Kse {

    // A 와 B 곱의 최소 구하기

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] listA;
    static int[] listB;
    static int idx;
    static int answer;

    public static void main (String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        listA = new int[N];
        listB = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i ++) {
            listA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i ++) {
            listB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(listA);
        Arrays.sort(listB);

        idx = N -1;
        answer = 0;

        for (int i = 0; i < N; i++) {
            answer += listA[i] * listB[idx--];
        }

        System.out.println(answer);
    }
}
