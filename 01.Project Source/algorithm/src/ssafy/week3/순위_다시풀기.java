package ssafy.week3;


public class 순위_다시풀기 {
    public static void main(String[] args) {
        int n = 5;
        int [][] arr = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};

        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[][] arr) {
        int answer = 0;
        int[][] closeArr = new int[n+1][n+1];

        for(int i = 0; i < arr.length; i++) {
            closeArr[arr[i][0]][arr[i][1]] = 1;
            closeArr[arr[i][1]][arr[i][0]] = -1;
        }

        // 플로이드-워셜 알고리즘
        // a->b, b->c 일 경우 a->c이다를 이용해 문제를 푸는 것
        for (int c = 1; c <= n; c++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    if(closeArr[a][c] == 1 && closeArr[c][b] == 1){
                        closeArr[a][b] = 1;
                        closeArr[b][a] = -1;
                    }

                    if(closeArr[a][c] == -1 && closeArr[c][b] == -1){
                        closeArr[a][b] = -1;
                        closeArr[b][a] = 1;
                    }
                }
            }
        }

        // 경기를 이긴다. == 1, 경기를 진다. == -1, 모른다 == 0
        // 자신을 제외한 경기는 지거나 이긴다는 것을 담고 있어야 함으로 0은 반드시 1개여야함
        //   - 자기 자신과는 싸울 수 없으니..^^
        for (int a = 1; a <= n; a++) {
            int count = 0;

            for (int b = 1; b <= n; b++) {
                if(closeArr[a][b] == 0){
                    count++;
                }
            }

            if(count == 1){
                answer++;
            }
        }

        return answer;

    }
}
