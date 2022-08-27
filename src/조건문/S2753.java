package 조건문;

import java.util.Scanner;

public class S2753 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();

        int result = (inputYear % 4 == 0)
                && ((inputYear % 100 != 0) || (inputYear % 400 == 0)) ? 1 : 0;
        System.out.println(result);
    }
}
