package 백준.입출력;

import java.util.Scanner;

public class _2446 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lastIdx = (n*2)-1;
        int startIdx = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < (n*2)-1; i++) {
            for (int j = 0; j < lastIdx; j++) {
                if(startIdx <= j){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }

            if(i < n-1){
                lastIdx--;
                startIdx++;
            }else{
                lastIdx++;
                startIdx--;
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
