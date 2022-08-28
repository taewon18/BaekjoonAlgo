package 백준.조건문;

import java.util.Scanner;

public class S1330 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        if (input1 > input2) {
            System.out.println(">");
        } else if (input1 < input2) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
