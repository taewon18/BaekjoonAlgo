package 조건문;

import java.util.Scanner;

public class S14681 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result;
        if (num1 > 0) {
            if (num2 > 0) {
                result = 1;
            } else {
                result = 4;
            }
        } else {
            if (num2 > 0) {
                result = 2;
            } else {
                result = 3;
            }
        }
        System.out.println(result);
    }
}
