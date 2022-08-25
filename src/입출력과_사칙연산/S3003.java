package 입출력과_사칙연산;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S3003 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,1,2,2,2,8);
        List<Integer> results = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int number : numbers) {
            int input = scanner.nextInt();
            results.add(number - input);
        }

        for (int result : results) {
            System.out.print(result + " ");
        }
    }
}
