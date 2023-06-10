package ssafy.week4;

import java.io.*;
import java.util.*;

public class 차이를최대로 {
    static int N;
    static int[] integers;
    static boolean[] checkInteger;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String integerString = br.readLine();
        integers = new int[N];
        checkInteger = new boolean[N];

        inputArrayData(integerString);
        solution();
    }

    private static void inputArrayData(String integerString) {
        StringTokenizer st = new StringTokenizer(integerString," ");
        int idx = 0;
        while(st.hasMoreTokens()){
            integers[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
    }

    private static void solution() {

    }


}
