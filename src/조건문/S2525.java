package 조건문;

import java.util.Scanner;

public class S2525 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int settingTime = scanner.nextInt();

        minute = minute + settingTime;
        if (minute >= 60) {
            int overhour = minute / 60;
            hour = hour + overhour;
            minute = minute - (overhour * 60);
        }
        if (hour >= 24) {
            hour = hour - 24;
        }
        System.out.println(hour + " " + minute);
    }
}
