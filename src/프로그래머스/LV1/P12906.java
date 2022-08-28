package 프로그래머스.LV1;

import java.util.ArrayList;
import java.util.List;

//같은 숫자는 싫어
public class P12906 {

    public static void main(String[] args) {
        P12906 p12906 = new P12906();
        int[] arr = {1,1,3,3,0,1,1};
        int[] solution = p12906.solution(arr);
    }

    public int[] solution(int []arr) {
        List<Integer> nums = new ArrayList<>();
        int current = arr[0];
        nums.add(current);
        for (int count = 1; count < arr.length; count++) {
            int select = arr[count];
            current = nums.get(nums.size() - 1);
            if (current != select) {
                nums.add(select);
            }
        }
        int[] answer = new int[nums.size()];
        for (int count = 0; count < nums.size(); count++) {
            answer[count] = nums.get(count);
        }
        return answer;
    }
}
