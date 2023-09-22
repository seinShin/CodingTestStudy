package hash;

import java.util.*;
import java.io.*;

public class Sep2Week_1327_Ssi {

    static int k;
    static int n;
    static int cnt;
    static int[] game;
    static int[] sortGame;

    static HashMap<String, Integer> visited = new HashMap<>();


    // 정수 배열을 이어 붙여 하나의 스트링으로 반환하는 함수
    public static String makeStr(int[] lst){

        String s="";
        for(int i=0; i< lst.length; i++){
            s+= String.valueOf(lst[i]);
        }

        return s;
    }

    //배열 뒤집기
    public static String reverseStr(String str, int i, int j){

        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0,i));

        String reverse = str.substring(i,j);

        System.out.println(reverse+ "--123123");
        for (int a = reverse.length()-1; a >= 0; a--) {
            sb.append(reverse.charAt(a));
        }

        sb.append(str.substring(j,str.length()));


        return sb.toString();
    }

    // 경우의 수 검사하는 함수
    public static int bfs(int[] lst){
        Queue<String> q = new LinkedList<>();
        String s1 = makeStr(lst);
        q.add(s1);
        visited.put(s1, 1);

        // 정렬 배열
        sortGame = new int[lst.length];
        sortGame = Arrays.copyOf(lst, lst.length);
        Arrays.sort(sortGame);


        cnt = -1;
        while (!q.isEmpty()){
            cnt +=1;
            System.out.println(q);
            for(int i=0; i< q.size(); i++){
                String cur = q.poll();

                if (cur.equals(makeStr(sortGame))){
                    return cnt;
                }
                String s2 ="";
                for(int j=0; j< n-k+1; j++){
                    s2 = reverseStr(cur, j, j+k-1);

                    System.out.println(s2+"-----s2");
                    if(!visited.containsKey(s2)){
                        System.out.println(s2+"-----s3");
                        visited.put(s2, 1);
                        q.add(s2);
                    }
                }
            }
            System.out.println(visited);
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());


        game = new int[n];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            game[i] = Integer.parseInt(st.nextToken());
            System.out.println(game[i]);
        }

        System.out.println(bfs(game));
    }

}
