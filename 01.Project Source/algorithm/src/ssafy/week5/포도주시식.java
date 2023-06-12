package ssafy.week5;

import java.util.Scanner;

public class 포도주시식 {
    static int N;
    static int[] Integers;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        Integers = new int[N];
        for (int idx = 0; idx < N; idx++) {
            inputData(idx, scan.nextInt());
        }

        System.out.println(solution());
    }

    private static void inputData(int idx, int integer) {
        Integers[idx] = integer;
    }

    private static int solution() {
        int max = 0;
        int[] sum = new int[N];
        sum[0] = Integers[0];
        sum[1] = Integers[0] + Integers[1];
        sum[2] = Integers[2] + Integers[1] < Integers[2] + Integers[0] ? Integers[2] + Integers[0] : Integers[2] + Integers[1];

        for (int i = 3; i < Integers.length; i++) {
            int acculmulate1 = Integers[i] + Integers[i-1] + sum[i-3];
            int acculmulate2 = Integers[i] + sum[i-2];

            max = Math.max(acculmulate1,acculmulate2);
            max = Math.max(sum[i-1], max);

        }

        if(N < 3){
            for (int i = 0; i < sum.length; i++) {
                if(max < sum[i]){
                    max = sum[i];
                }
            }
        }

        return max;
    }


}
