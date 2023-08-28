package implementation;

import java.util.Scanner;
public class Aug5Week_1010_Ssi {

    //팩토리얼 함수 -> 재귀함수로 짤 경우 수가 커지면 stackOverFlow 발생
   /* static int factorial(int n){
        if (n ==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }*/

    //팩토리얼 함수 2 -> 반복문 형태로 수정 / int로 하면 범위 초과 double로 하면 소수점 고려
    static double factorial(double n){
        if (n<=1) return 1;

        double f = 1;
        for(double i=1;i<n+1;i++){
            f *= i;
        }

        return f;
    }
    static double combination(double n, double m){
        double mf = factorial(m);
        double mnf = factorial(m-n);
        double nf = factorial(n);

        return mf/(mnf*nf);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i=0; i<t; i++){
            double n = sc.nextInt();
            double m = sc.nextInt();

            System.out.printf("%.0f\n", combination(n,m));
        }
    }
}
