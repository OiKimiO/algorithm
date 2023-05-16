package ssafy.week1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds     = new int[]{1, 30, 5};
        solution(progresses, speeds);
    }

    public static int[] solution(int[] progresses, int[] speeds){
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            double data = (double) (100 - progresses[i]) / (double) speeds[i];
            queue.add((int) Math.ceil(data));
        }

        int day = queue.poll();
        int count = 1;
        while(queue.size() > 0){
            if(queue.peek() <= day){
                queue.poll();
                count++;
            }else{
                day = queue.poll();
                list.add(count);
                count = 1;
            }
        }

        list.add(count);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
