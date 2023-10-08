package math;

import java.io.*;
import java.util.*;

public class Sep4Week_1004_Kse  {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int T;
    static int x1, y1, x2, y2;
    static int cx, cy, r;
    static double d1, d2, r2;
    static int N;
    static int cnt;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i ++){
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            N = Integer.parseInt(br.readLine());
            cnt=0;

            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                cx = Integer.parseInt(st.nextToken());
                cy = Integer.parseInt(st.nextToken());
                r = Integer.parseInt(st.nextToken());

                d1 = Math.pow((x1 - cx), 2) + Math.pow((y1 - cy), 2);
                d2 = Math.pow((x2 - cx), 2) + Math.pow((y2 - cy), 2);
                r2 = Math.pow(r, 2);

                if (!((r2>d1) && (r2>d2)) && r2 > d1){
                    cnt++;
                }else if(!((r2>d1) && (r2>d2)) && r2 > d2){
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}
