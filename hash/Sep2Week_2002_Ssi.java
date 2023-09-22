package hash;

import java.util.*;
import java.io.*;
public class Sep2Week_2002_Ssi {
    /***
     * Hashmap은 저장공간보다 값이 추가로 들어오면 List처럼 한칸씩 늘리는게 아니고
     * 두배로 늘린다고 합니다.
     * 그래서 HashMap 사용시 초기 값을 지정해주는 것이 효율적일 것 같습니다.
     */
    static int n;
    static HashMap<String, Integer> inCar;
    static String[] outCar;

    static int cnt;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        n = Integer.parseInt(bf.readLine());
        inCar = new HashMap<String, Integer>(n);

        // 들어오는 차 세팅
        for(int i=0; i<n; i++){
            String car = bf.readLine();
            inCar.put(car, i+1);
        }

        // 나가는 차 세팅
        outCar = new String[n];
        for(int i=0; i<n; i++){
            String car = bf.readLine();
            outCar[i] = car;
        }

        // 추월 차 계산
        cnt = 0;
        for(int i=0 ; i<n-1; i++){
            for(int j=i+1; j<n;j++){
                if((int) inCar.get(outCar[i]) > (int) inCar.get(outCar[j])){
                    cnt+=1;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
