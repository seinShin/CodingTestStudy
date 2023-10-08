package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sep4Week_7568_Kse {
    // 나보다 덩치가 큰 사람의 수 + 1 == 내 등수

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[][] people;
    static int N;
    static int cnt;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        people = new int[N][2];

        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            people[i][0] = Integer.parseInt(st.nextToken());
            people[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i ++) {
            cnt = 0; // 초기화

            for (int j = 0; j < N; j ++) {
                if ((people[i][0] < people[j][0]) && (people[i][1] < people[j][1])) { // 나보다 덩치가 큰 경우
                    cnt ++;
                }
            }
            sb.append(cnt + 1).append(" ");
        }

        System.out.println(sb.toString());
    }
}
