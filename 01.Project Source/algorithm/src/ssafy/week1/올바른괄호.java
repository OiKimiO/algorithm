package ssafy.week1;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        String s = "(()(";
        System.out.println(solution(s));
    }

    public static boolean solution(String s){
        Stack<Character> stk = new Stack<>();
        outter:for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case '(':
                    stk.add(s.charAt(i));
                    break;
                case ')':
                    if(!stk.isEmpty()){
                        stk.pop();
                    }else{
                        stk.add('X');
                        break outter;
                    }
                    break;
            }
        }
        return stk.size() > 0 ? false : true;
    }
}
