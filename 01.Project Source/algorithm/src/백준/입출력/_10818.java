package 백준.입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = -Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        while(st.hasMoreTokens()){
            int i = Integer.parseInt(st.nextToken());
            if(max < i){
                max = i;
            }
            if(min > i){
                min = i;
            }
        }

        System.out.println(min + " " + max);
    }
}
