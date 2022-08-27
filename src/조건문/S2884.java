package 조건문;

import java.util.Scanner;

public class S2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        minute = minute - 45;
        if (minute < 0) {
            hour = hour - 1;
            minute = 60 + minute;
        }
        if (hour < 0) {
            hour = 23;
        }
        System.out.println(hour + " " + minute);
    }
}
