package 백준.입출력;

import java.util.Scanner;

public class _2442 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lastIdx = n-1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            for (int j = lastIdx; j >= 0; j--) {
                if(i >= j){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }

            for (int j = 0; j < i; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
