package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sep4Week_20937_Kse {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static HashMap<Integer, Integer> map = new HashMap<>();
    static int N;
    static int max;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i ++) {
            int temp = Integer.parseInt(st.nextToken());
            if (!map.containsKey(temp)) {
                map.put(temp, 1);
            } else {
                map.put(temp, map.get(temp) + 1);
            }
        }

        max = Collections.max(map.values());
        System.out.println(max);
    }
}
