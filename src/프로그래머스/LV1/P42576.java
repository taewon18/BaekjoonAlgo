package 프로그래머스.LV1;

/*
* 완주하지 못한 선수
* */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//완주하지 못한 선수
public class P42576 {
    public static void main(String[] args) {
        String[] participant = {"marina","josipa","nikola","vinko","filipa"};
        String[] completion = {"josipa","filipa","marina","nikola"};

        Solution solution = new Solution();
        String answer = solution.solution(participant, completion);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> participants = Arrays.asList(participant);
        List<String> completions = Arrays.asList(completion);
        Collections.sort(participants);
        Collections.sort(completions);

        for(int i = 0; i < completions.size(); i++) {
            if(!completions.get(i).equals(participants.get(i))) {
                answer = participants.get(i);
                break;
            }
        }
        if(answer.equals("")) {
            answer = participants.get(completions.size());
        }
        return answer;
    }
}
