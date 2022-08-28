package 반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = scanner.nextInt();

        List<Integer> sums = new ArrayList<>();
        for(int count = 0; count < totalCount; count++) {
            int inputNum1 = scanner.nextInt();
            int inputNum2 = scanner.nextInt();
            sums.add(inputNum1 + inputNum2);
        }
        sums.stream().forEach(System.out::println);
    }
}
