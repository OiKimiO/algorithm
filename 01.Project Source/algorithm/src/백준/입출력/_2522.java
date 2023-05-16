package 백준.입출력;

import java.util.Scanner;

public class _2522 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lastIdx = n-1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < n; j++) {
                if(j >= lastIdx){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }

            if(i < n-1){
                lastIdx--;
            }else{
                lastIdx++;
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
