package ssafy.week1;

import java.util.*;

public class 주식가격_다시 {
    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 2, 3};
        for (int price : solution(prices)) {
            System.out.println(price + " ");
        }
    }

    private static int[] solution(int[] prices) {
        int total = prices.length;
        int[] answer = new int[total];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < total; i++) {
            if (!stk.isEmpty() && stk.peek() > prices[i]){
                int stkSize = stk.size();
                while(!stk.isEmpty()){
                    answer[stk.size()-1] += (i - (stk.size()-1));
                    stk.pop();
                }
            }
            stk.push(prices[i]);
        }

        return answer;
    }
}
