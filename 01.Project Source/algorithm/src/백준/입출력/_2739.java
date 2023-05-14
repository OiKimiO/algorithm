package 백준.입출력;

import java.util.Scanner;

public class _2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int n = scan.nextInt();
        for (int i = 1; i <= 9; i++) {
            sb.append(n+" * "+i +" = "+(n*i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
