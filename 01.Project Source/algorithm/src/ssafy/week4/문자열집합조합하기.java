package ssafy.week4;

import java.util.*;

public class 문자열집합조합하기 {
    static Map<String,Integer> map = new TreeMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String X = scan.nextLine();
        String Y = scan.nextLine();
        String Z = scan.nextLine();
        int K = scan.nextInt();
        solution(X,Y,Z,K);
    }

    private static void solution(String x, String y, String z, int k) {
        combination(x,"",k,0,0);
        combination(y,"",k,0,0);
        combination(z,"",k,0,0);
        extractAnswer();
    }

    private static void extractAnswer() {
        StringBuffer sb = new StringBuffer();

        for(String key : map.keySet()){
            int n = map.get(key);
            if(n >= 2){
                sb.append(key).append("\n");
            }
        }

        System.out.println(sb.toString().equals("")?"-1":sb.toString());
    }

    private static void combination(String str, String tmp, int k, int depth, int startIdx) {
        if(depth == k){
            map.put(tmp, map.getOrDefault(tmp,0) + 1);
            return;
        }

        for (int i = startIdx; i < str.length(); i++) {
            combination(str,tmp+str.charAt(i),k,depth+1,i+1);
        }
    }

}
