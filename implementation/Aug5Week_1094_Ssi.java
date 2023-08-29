package implementation;
// BufferedReader 사용하기
import java.io.*;
public class Aug5Week_1094_Ssi {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        int cnt =0;

        int[] stick={64,32,16,8,4,2,1};

        for(int i=0; i<stick.length;i++){
            if(x>= stick[i]){
                cnt++;
                x-=stick[i];
            }

            if(x==0){
                break;
            }
        }

        System.out.println(cnt);
    }
}
