package 반복문;

import java.util.Scanner;

public class S8393 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int result = 0;

        for(int index = 1;  index <= inputNum; index++) {
            result = result + index;
        }
        System.out.println(result);
    }
}
