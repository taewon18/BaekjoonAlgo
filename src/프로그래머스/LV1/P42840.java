package 프로그래머스.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P42840 {

    public static void main(String[] args) {
        P42840 p42840 = new P42840();
        int[] answers = {1,2,3,4,5};
        p42840.solution(answers);
    }

    public int[] solution(int[] answers) {
        List<Integer> firstSolve = Arrays.asList(1,2,3,4,5);
        List<Integer> secondSolve = Arrays.asList(2,1,2,3,2,4,2,5);
        List<Integer> thirdSolve = Arrays.asList(3,3,1,1,2,2,4,4,5,5);

        int first = compare(answers, firstSolve);
        int second = compare(answers, secondSolve);
        int third = compare(answers, thirdSolve);
        int max = Math.max(Math.max(first, second), third);

        List<Integer> list = new ArrayList<Integer>();
        if (first == max) { list.add(1); }
        if (second == max) { list.add(2); }
        if (third == max) { list.add(3); }

        int[] answer = new int[list.size()];
        for (int count = 0; count < list.size(); count++) {
            answer[count] = list.get(count);
        }
        return answer;
    }

    private int compare(int[] answers, List<Integer> solves) {
        int correct = 0;
        int solvesSize = solves.size();
        for (int index = 0; index < answers.length; index++) {
            int answer = answers[index];
            int solveCount = index >= solvesSize ? index % solvesSize : index;
            int solve = solves.get(solveCount);
            if (answer == solve) {
                correct++;
            }
        }
        return correct;
    }
}
