package 입출력과_사칙연산;

import java.util.Scanner;

public class S2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        String inputStr = String.valueOf(input2);
        String[] split = inputStr.split("");
        for (int count = 2; count >= 0; count--) {
            int result = Integer.parseInt(split[count]) * input1;
            System.out.println(result);
        }
        System.out.println(input1 * input2);
    }
}
