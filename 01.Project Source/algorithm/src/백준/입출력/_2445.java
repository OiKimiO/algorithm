package 백준.입출력;

import java.util.Scanner;

public class _2445 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int firstPrintIdx = 0;
        int lastPrintIdx  = (n * 2) - 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < n * 2; j++) {
                if(i < n){
                    if(j <= firstPrintIdx || j >= lastPrintIdx){
                        sb.append("*");
                    }else{
                        sb.append(" ");
                    }
                }else{
                    if(j <= firstPrintIdx || j >= lastPrintIdx){
                        sb.append("*");
                    }else{
                        sb.append(" ");
                    }
                }
            }

            if(i < n-1){
                firstPrintIdx++;
                lastPrintIdx--;
            }else{
                firstPrintIdx--;
                lastPrintIdx++;
            }

            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
