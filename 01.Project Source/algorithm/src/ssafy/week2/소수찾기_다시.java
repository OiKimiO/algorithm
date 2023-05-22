package ssafy.week2;

// 틀림
public class 소수찾기_다시 {
    static boolean[] arr_bool;
    public static void main(String[] args) {
        String numbers = "134";
        System.out.println("answer = " + solution(numbers));
    }

    public static int solution(String numbers){
        int answer = 0;
        int total = numbers.length();
        arr_bool = new boolean[total];
        dfs(numbers, 0, total, "", 0);


        return answer;
    }

    public static int dfs(String numbers, int startIdx, int total, String prime, int level){

        for (int i = startIdx; i < total; i++) {
            if(!arr_bool[i]) {
                arr_bool[i] = true;
                isPrime(prime + numbers.charAt(i));
                dfs(numbers, startIdx + 1, total, prime + numbers.charAt(i), level+1);

                arr_bool[i] = false;
            }
        }
        return 0;
    }

    private static void isPrime(String prime) {
        System.out.println(prime);
    }
}
