package 백준.입출력;

import java.util.Scanner;

public class _11721 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for(int i = 0; i < str.length(); i++){
            int startIdx = i;
            int lastIdx  = i+10 > str.length() ? str.length() : i+10;
            System.out.println(str.substring(startIdx, lastIdx));
            i += 9;
        }
    }
}
