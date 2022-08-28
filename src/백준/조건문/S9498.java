package 백준.조건문;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class S9498 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String score = "F";
        Map<Integer, String> point = new LinkedHashMap<>();
        point.put(60,"D");
        point.put(70,"C");
        point.put(80,"B");
        point.put(90,"A");

        for (Map.Entry<Integer, String> entry : point.entrySet()) {
            if (entry.getKey() <= input) {
                score = entry.getValue();
            } else {
                break;
            }
        }
        System.out.println(score);
    }
}
