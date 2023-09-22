package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sep2Week_10825_Kse {

    /**
     * 정렬 순서
     * 1. 국어 점수가 감소하는 순서
     * 2. 같으면 영어 점수가 증가하는 순서
     * 3. 국어와 영어가 같으면 수학 점수가 감소하는 순서
     * 4. 모든 점수가 같으면 이름 사전순
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static String[][] students;
    static String[] temp;

    public static void main (String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        students = new String[N][4];

        for (int i = 0; i < N; i ++) {
            temp = br.readLine().split(" ");

            for (int j = 0; j < temp.length; j ++) {
                students[i][j] = temp[j];
            }
        }

        // 정렬
        Arrays.sort(students, (o1, o2) -> {
            if (o1[1].equals(o2[1])) { // 국어 점수가 같으면
                if (o1[2].equals(o2[2])) { // 국어와 영어 점수가 같으면
                    if (o1[3].equals(o2[3])) { // 모든 점수가 같으면
                        return o1[0].compareTo(o2[0]); // 이름이 사전 순서로 증가하는 순서로 정렬
                    }
                    return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]); // 수학 점수 감소 순서로 정렬
                }
                return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]); // 영어 증가 순서로 정렬
            }
            return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]); // 국어 감소 순서로 정렬
        });

        // 출력
        for (String[] name : students) {
            sb.append(name[0]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
