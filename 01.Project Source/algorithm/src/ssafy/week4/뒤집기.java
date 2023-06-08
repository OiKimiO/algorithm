package ssafy.week4;

import java.util.Scanner;

public class 뒤집기 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.next()));
    }

    private static int solution(String data) {
        int zero = 0;
        int one  = 0;

        if(data.charAt(0) == '1'){
            one++;
        }else{
            zero++;
        }

        for (int i = 0; i < data.length()-1; i++) {
            if(data.charAt(i) != data.charAt(i+1)){
                if(data.charAt(i+1) == '1'){
                    one++;
                }else{
                    zero++;
                }
            }
        }

        return Math.min(zero,one);
    }
}
