package priorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Sep4Week_14235_Ssi {

    static int n;
    static PriorityQueue<Integer> gift = new PriorityQueue<>(Collections.reverseOrder());


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(bf.readLine());

        for(int i=0; i<n;i++){
            st = new StringTokenizer(bf.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            if( tmp == 0){
                if(gift.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(gift.poll());
                }
            }else{
                for(int j=0; j<tmp;j++){
                    int present = Integer.parseInt(st.nextToken());
                    gift.offer(present);
                }
            }
        }
    }
}
