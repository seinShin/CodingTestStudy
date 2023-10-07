package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sep4Week_1004_Ssi {
    static int t;
    static int x1,y1,x2,y2;
    static int cx,cy,r;
    static int n;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(bf.readLine());

        for(int i=0; i<t;i++){
            st = new StringTokenizer(bf.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            n = Integer.parseInt(bf.readLine());
            cnt=0;
            for(int j=0;j<n;j++){
                st = new StringTokenizer(bf.readLine());
                cx = Integer.parseInt(st.nextToken());
                cy = Integer.parseInt(st.nextToken());
                r = Integer.parseInt(st.nextToken());

                Double d1 = Math.pow((x1-cx),2)+ Math.pow((y1-cy),2);
                Double d2 = Math.pow((x2-cx),2)+ Math.pow((y2-cy),2);
                Double r2 = Math.pow(r,2);

                if((r2>d1) && (r2>d2)){

                }else if (r2>d1){
                    cnt++;
                }else if(r2>d2){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
