package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step1Week_1541_Kse {

    /**
     * 괄호를 적절히 쳐서 식의 값을 최소로 만들기
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[] equations;
    static String[] numbers;
    static int sum;
    static int answer;

    public static void main(String[] args) throws IOException {
        equations = br.readLine().split("-");

        for (int i = 0; i < equations.length; i++) {
            // + 가 있는 문자열을 분해한 후, 합을 구한다.
            numbers = equations[i].split("\\+");
            sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += Integer.parseInt(numbers[j]);
            }

            if (i == 0) {
                answer += sum;
            } else {
                answer -= sum;
            }
        }

        System.out.println(answer);
    }
}
