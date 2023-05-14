package 백준.입출력;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _11021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());

            sb.append("Case #"+i+": " +(a+b)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
