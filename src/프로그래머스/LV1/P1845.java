package 프로그래머스.LV1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//폰켓몬
public class P1845 {

    public static void main(String[] args) {
        P1845 p1845 = new P1845();
        int[] nums = {3,1,2,3};
        p1845.solution(nums);
    }

    public int solution(int[] nums) {
        int maxPocketmon = nums.length / 2;
        List<Integer> numList = Arrays.stream(nums).boxed().distinct().collect(Collectors.toList());
        int answer = numList.size();
        if (answer > maxPocketmon) {
            answer = maxPocketmon;
        }
        return answer;
    }
}
