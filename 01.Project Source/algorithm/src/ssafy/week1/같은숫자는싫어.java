package ssafy.week1;

import java.util.Stack;
/**
 * Queue를 이용해 구현했으면 좀 더 편하게 만들었을 수도 있었겠습니다.
 * */
public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,3,3,0,1,1};
        solution(arr);
    }

    public static int[] solution(int[] arr){
        Stack<Integer> stk = new Stack<>();
        stk.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(stk.peek() == arr[i]){
                continue;
            }
            stk.add(arr[i]);
        }
        int[] answer = new int[stk.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stk.pop();
        }
        return answer;
    }
}
