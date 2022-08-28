package 백준.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        StringBuffer buffer = new StringBuffer();
        while (true) {
            tokenizer = new StringTokenizer(reader.readLine());
            int num1 = Integer.parseInt(tokenizer.nextToken());
            int num2 = Integer.parseInt(tokenizer.nextToken());
            if (num1 == 0 && num2 == 0) {
                break;
            }
            buffer.append(num1 + num2).append("\n");
        }
        System.out.println(buffer);
    }
}
