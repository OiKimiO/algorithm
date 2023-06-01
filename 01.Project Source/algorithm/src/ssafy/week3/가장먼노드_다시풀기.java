package ssafy.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 가장먼노드_다시풀기 {
    public static void main(String[] args) {
        int n = 6;
        int [][] arr = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        solution(n, arr);
    }

    private static void solution(int n, int[][] arr) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean[] arr_bool = new boolean[n+1];
        int[] distance     = new int[n+1];

        for (int i = 0; i <= arr.length; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < arr.length; i++) {
            list.get(arr[i][0]).add(arr[i][1]);
            list.get(arr[i][1]).add(arr[i][0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        arr_bool[1] = true;
        System.out.println(list);

        while(!queue.isEmpty()){
            int number = queue.poll();
            ArrayList<Integer> node = list.get(number);

            for (int i = 0; i < node.size(); i++) {
                int nodeNumber = node.get(i);
                if(!arr_bool[nodeNumber]){
                    arr_bool[nodeNumber] = true;
                    queue.add(nodeNumber);
                    distance[nodeNumber] = distance[number] + 1;
                }
            }

        }

        Arrays.sort(distance);

        for (int i = 0; i < distance.length; i++) {
            System.out.println(distance[i]);
        }
    }
}
