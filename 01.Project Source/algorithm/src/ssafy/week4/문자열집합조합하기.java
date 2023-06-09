package ssafy.week4;

import java.util.*;

public class 문자열집합조합하기 {
    static Map<String,Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String X = scan.nextLine();
        String Y = scan.nextLine();
        String Z = scan.nextLine();
        int K = scan.nextInt();
        solution(X,Y,Z,K);
        System.out.println(map);
    }

    private static void solution(String x, String y, String z, int k) {
        dfs(x,"",k,0,0);
        dfs(y,"",k,0,0);
        dfs(z,"",k,0,0);
        extractAnswer();
    }

    private static void extractAnswer() {

        for(String key : map.keySet()){
            int n = map.get(key);
            if(n >= 2){

            }
        }
    }

    private static void dfs(String str, String tmp, int k, int depth, int startIdx) {
        if(depth == k){
            map.put(tmp, map.getOrDefault(tmp,0) + 1);
            return;
        }

        for (int i = startIdx; i < str.length(); i++) {
            dfs(str,tmp+str.charAt(i),k,depth+1,i+1);
        }

    }

}
