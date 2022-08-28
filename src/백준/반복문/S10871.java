package 백준.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int totalCount = Integer.parseInt(tokenizer.nextToken());
        int maxNum = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());
        StringBuffer buffer = new StringBuffer();
        for (int count = 0; count < totalCount; count++) {
            int inputNum = Integer.parseInt(tokenizer.nextToken());
            if (inputNum < maxNum) {
                buffer.append(inputNum).append(" ");
            }
        }
        System.out.println(buffer);
    }
}
