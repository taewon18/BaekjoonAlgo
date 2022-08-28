package 프로그래머스.LV1;

import java.util.*;

//성격 유형 검사
public class P118666 {

    public static void main(String[] args) {
        P118666 p118666 = new P118666();
        String[] surveys = {"TR", "RT", "TR"};
        int[] choices = {7,1,3};
        String solution = p118666.solution(surveys, choices);
        System.out.println(solution);
    }

    //survey = 지표
    //choices = 선택
    public String solution(String[] surveys, int[] choices) {
        Map<String, Integer> result = new HashMap<String, Integer>(){{
            put("R",0); put("T",0);
            put("C",0); put("F",0);
            put("J",0); put("M",0);
            put("A",0); put("N",0);
        }};

        for (int count = 0; count < surveys.length; count++) {
            int choice = choices[count];
            if (choice == 4) { continue; }

            String survey = surveys[count];
            String[] splitSurvey = survey.split("");
            String key = null;
            if (choice < 4) {
                // splitSurvey.split[0], 비동의
                key = splitSurvey[0];
                choice = -(choice - 4);
            } else if (choice > 4) {
                // splitSurvey.split[1], 동의
                key = splitSurvey[1];
                choice = choice - 4;
            }
            result.put(key, result.get(key) + choice);
        }

        List<String> keys = new ArrayList<>(Arrays.asList("RT", "CF", "JM", "AN"));
        StringBuilder builder = new StringBuilder();
        for (String key : keys) {
            String[] split = key.split("");
            String firstKey = split[0];
            String secondKey = split[1];

            int firstChoice = result.get(firstKey);
            int secondChoice = result.get(secondKey);

            if (firstChoice < secondChoice) {
                firstKey = secondKey;
            }
            builder.append(firstKey);
        }
        return builder.toString();
    }
}
