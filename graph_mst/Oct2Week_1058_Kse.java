package graph_mst;

import java.io.*;
import java.util.*;

public class Oct2Week_1058_Kse {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[][] arr = new int[50][50];
    static int max = 0;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String relation = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = relation.charAt(j) == 'Y' ? 1 : 0;
            }
        }

        for (int i = 0; i < N; i++) {
            max = Math.max(max, solve(i));
        }
        System.out.println(max);

    }

    public static int solve(int n) {
        HashSet<Integer> friendSet = new HashSet<>(); // 친구인 경우
        Queue<Integer> queue = new LinkedList<>(); // 친구가 아닌 경우

        for (int i = 0; i < N; i++) { // 첫번째 친구인 경우
            if (i == n) continue;
            if (arr[n][i] == 1) {
                friendSet.add(i);
            } else {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) { // 두번째 친구인 경우
            int cur = queue.poll();

            for (int i = 0; i < N; i++) {
                if (i == n) continue;
                if (arr[cur][i] == 1 && arr[i][n] == 1) {
                    friendSet.add(cur);
                }
            }
        }

        return friendSet.size();
    }
}
