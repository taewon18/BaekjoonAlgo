package 백준.반복문;

import java.util.Scanner;

public class S25304 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputAmount = scanner.nextInt();
        int totalIndex = scanner.nextInt();
        int realAmount = 0;

        for (int index = 0; index < totalIndex; index++) {
            int money = scanner.nextInt();
            int count = scanner.nextInt();
            realAmount = realAmount + (money * count);
        }

        if (inputAmount == realAmount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
