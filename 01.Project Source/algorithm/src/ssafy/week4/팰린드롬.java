package ssafy.week4;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class 팰린드롬 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.next()));
    }

    private static String solution(String input) {
        int[] alphabets = new int[30];
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        Stack<Character> stk = new Stack<>();
        Character last_char = null;
        int count = 0;
        int check_count = 0;

        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            map.put(charAt, map.getOrDefault(charAt,0) + 1);
            int ascii = charAt - 65;
            alphabets[ascii]++;
        }

        for (int i = 0; i < alphabets.length; i++) {
            if(check_count > 1){
                sb.setLength(0);
                sb.append("I'm Sorry Hansoo");
            }

            // 알파벳 갯수가 홀수일 경우
            if(alphabets[i] % 2 == 1){
                char alphabet = (char) (i + 65);
                last_char = alphabet;
                check_count++;
            }

            for (int j = 0; j < alphabets[i]/2; j++) {
                char alphabet = (char) (i + 65);
                sb.append(alphabet);
                stk.add(alphabet);
            }
        }

        if(check_count == 1){
            sb.append(last_char);
            while(!stk.isEmpty()){
                sb.append(stk.pop());
            }
        }else if(check_count == 0){
            while(!stk.isEmpty()){
                sb.append(stk.pop());
            }
        }

        return sb.toString();
    }
}
