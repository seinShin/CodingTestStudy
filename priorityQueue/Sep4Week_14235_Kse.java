package priorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Sep4Week_14235_Kse {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i ++) {
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());

            if (temp == 0) {
                if (priorityQueue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(priorityQueue.poll());
                }
            } else {
                for (int j = 0; j < temp; j ++) {
                    priorityQueue.add(Integer.parseInt(st.nextToken()));
                }
            }
        }
    }
}
