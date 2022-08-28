package 백준.조건문;

import java.util.*;

public class S2480 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int index = 0; index < 3; index++) {
            int input = scanner.nextInt();
            numbers.add(input);
        }
        int result;

        long count = numbers.stream().distinct().count();
        if (count == 1) {
            result = 10000 + (numbers.get(0) * 1000);
        } else if (count == 2) {
            result = numbers.stream().distinct().filter(num -> {
                int correct = 0;
                for (int number : numbers) {
                    if (number == num) correct++;
                }
                return correct == 2;
            }).findFirst().get();
            result = 1000 + (result * 100);
        } else {
            result = numbers.stream()
                            .max(Comparator.comparingInt(Integer::intValue))
                            .get() * 100;
        }
        System.out.println(result);
    }
}
