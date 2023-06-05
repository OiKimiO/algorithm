package ssafy.week4;

public class 후보추천하기 {
    public static void main(String[] args) {
        int frame = 3;
        int n     = 9;
        int[] candidate = {2,1,4,3,5,6,2,7,2};
        solution(frame,n, candidate);
    }

    private static void solution(int frame, int n, int[] candidate) {

    }

    public static class data implements Comparable<data> {
        int ref = 0;
        int order = 0;


        @Override
        public int compareTo(data o) {
            return 0;
        }
    }
}
