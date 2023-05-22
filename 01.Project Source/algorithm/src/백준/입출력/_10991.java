package 백준.입출력;

import java.util.Scanner;

public class _10991 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lastIdx = n;
        int startIdx = n-1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < lastIdx; j++) {
                if(startIdx <= j) {
                    boolean bool = true;
                    if(n % 2 == 0){
                        bool = i % 2 == 0 ? j % 2 == 1 : j % 2 == 0;
                    }else{
                        bool = i % 2 == 0 ? j % 2 == 0 : j % 2 == 1;
                    }

                    if (bool) {
                        sb.append("*");
                    } else {
                        sb.append(" ");
                    }
                }else{
                    sb.append(" ");
                }
            }
            lastIdx++;
            startIdx--;
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
