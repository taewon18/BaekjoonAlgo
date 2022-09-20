package 프로그래머스.LV1;

public class P87389 {

    public static void main(String[] args) {
        P87389 p87389 = new P87389();
        System.out.println(p87389.solution(10));
        System.out.println(p87389.solution(12));
    }

    public int solution(int n) {
        int result = 0;
        for (int count = 2; count < n; count++) {
            int temp = n % count;
            if (temp == 1) {
                result = count;
                break;
            }
        }
        return result;
    }
}
