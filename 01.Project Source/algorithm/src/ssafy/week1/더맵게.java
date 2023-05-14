package ssafy.week1;

import java.util.*;

/**
 * 문제를 맞추진 못했습니다.
 * 왜냐하면 PriorityQueue에 대한 이해가 부족한 상태로 시간복잡도를 잘못 계산했습니다.
 * PriorityQueue가 logN이라 했을 때 1,000,000건의 배열 데이터를 넣었을 때 1,000,000,000건의 데이터를 넘게 봐서
 * 문제가 될 것이라 생각했지만 문제가 되지 않았습니다.
 * 이에 테스트 관점에서 PriorityQueue에 대한 이해가 필요해 보입니다.
 * */
public class 더맵게 {
    public static void main(String[] args) {
        System.out.println(solution());
    }

    public static int solution(){
        int K = 7;
        int[] scoville = new int[]{1,2,3,7,9};

        int answer = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++){
            queue.add((long)scoville[i]);
        }

        while(queue.peek() < K){
            if(queue.size() == 1){
                return -1;
            }

            long a = queue.poll();
            long b = queue.poll() * 2;

            answer++;
            queue.add(a+b);
        }

        return answer;
    }
}
