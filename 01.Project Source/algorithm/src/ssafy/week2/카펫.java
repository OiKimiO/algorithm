package ssafy.week2;

public class 카펫 {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        for (int price : solution(brown,yellow)) {
            System.out.println(price + " ");
        }
    }

    private static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = brown + yellow;
        int cross = 0;
        int vertical = 0;
        for (int i = 3; i < width; i++) {
            if(width % i == 0){
                cross = width/i;
                vertical = i;

                if(cross < vertical){
                    continue;
                }

                if(yellow == (cross - 2) * (vertical - 2)){
                    answer[0] = cross;
                    answer[1] = vertical;
                    break;
                }
            }
        }
        return answer;
    }
}
